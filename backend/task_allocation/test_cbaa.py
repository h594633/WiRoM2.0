from cbaa import CBAA
import pika

if __name__ == '__main__':
    # user_tasks0 = ["go_forward", "turn_right", "go_backwards"]
    # user_tasks1 = ["go_forward", "turn_right", "turn_left"]
    # user_tasks2 = ["go_forward", "turn_right", "turn_right", "turn_right", "turn_right"]
    # user_tasks3 = ["go_forward"]
    #
    # tasks_list = [user_tasks0, user_tasks1, user_tasks2, user_tasks3]

    connection = pika.BlockingConnection(
        pika.ConnectionParameters(host='localhost'))
    channel = connection.channel()

    channel.exchange_declare(exchange='cbaa_exchange', exchange_type='fanout')

    message = "test fanout message"
    channel.basic_publish(exchange='cbaa_exchange', routing_key='', body=message)
    print(" [x] Sent %r" % message)
    connection.close()