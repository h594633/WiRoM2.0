import React, {Component} from 'react';
class App extends Component {
  render () {
    return (
      <div>
        <ActionForm>
        </ActionForm>
      </div>
    );
  }
}

class ActionForm extends Component {
  state = {
    mission: {
      "robots" : [
        {
          "name" : "mavic2pro",
          "language" : "python",
          "port" : "5001",
          "actions" : [
            "set_altitude(1)", 
            "recognise_objects()", 
            "set_message_target('moose')", 
            "go_to_location([388. -365])", 
            "turn_left(4)", 
            "go_forward(4)"
          ]
        },
        {
          "name" : "moose",
          "language" : "python",
          "port" : "5002",
          "actions" : [
            "receive_location_from_robot()",
            "go_to_location([])"
          ]
        }
      ]
    }
  }

  handleSubmit = event => {
    sendMission(this.state.mission);
    event.preventDefault();
  }

  handleRobotChange = event => {
    const robot = this.state.mission.robots;
    robot.name = event.target.value;
    this.setState(robot)
  }

  handleActionsChange = id => event => {
    const robot = this.state.mission.robots[id];
    robot.actions = [];
    event.target.value.split(',').forEach(e => {
      robot.actions.push(e);
    });
    this.setState(robot)
  }

  render(){
    return(
      <div>
        <h1>Select robot mission</h1>

        <form onSubmit={this.handleSubmit}>
          <input 
            type="text"
            value={this.state.mission.robots[0].name}
            onChange={this.handleRobotChange}
          />

          <input
            type="text"
            value={this.state.mission.robots[0].actions}
            onChange={this.handleActionsChange(0)}
            style={{width: 200}}
          />
        </form>

        <form onSubmit={this.handleSubmit}>
          <input 
            type="text"
            value={this.state.mission.robots[1].name}
            onChange={this.handleRobotChange}
          />

          <input 
            type="text"
            value={this.state.mission.robots[1].actions}
            onChange={this.handleActionsChange(1)}
            style={{width: 200}}
          />

          <button type="submit">
            Send mission
          </button>
        </form>
      </div>
    );
  }
}

function sendMission(mission){
  console.log('Sending request')
  fetch('http://localhost:5000/controller', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(mission)
  })
  .then(res => console.log(res))
  .catch(console.log)
}

export default App;
