"use strict";
/******************************************************************************
 * This file was generated by langium-cli 0.3.0.
 * DO NOT EDIT MANUALLY!
 ******************************************************************************/
Object.defineProperty(exports, "__esModule", { value: true });
exports.RobotGeneratorGeneratedModule = exports.RobotGeneratorGeneratedSharedModule = exports.RobotGeneratorLanguageMetaData = void 0;
const ast_1 = require("./ast");
const grammar_1 = require("./grammar");
exports.RobotGeneratorLanguageMetaData = {
    languageId: 'robot-generator',
    fileExtensions: ['.robotgenerator'],
    caseInsensitive: false
};
exports.RobotGeneratorGeneratedSharedModule = {
    AstReflection: () => new ast_1.RobotGeneratorAstReflection()
};
exports.RobotGeneratorGeneratedModule = {
    Grammar: () => (0, grammar_1.RobotGeneratorGrammar)(),
    LanguageMetaData: () => exports.RobotGeneratorLanguageMetaData,
    parser: {}
};
//# sourceMappingURL=module.js.map