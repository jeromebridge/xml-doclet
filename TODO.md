# Details #
  * Create distributable package.

  * Need passthrough of all doclet parameters.  Today, one can only specify parameters xml-doclet has chosen to expose.

  * Create XSD describing XML format.

  * Upgrade to trunk (instead of stable) appassembler, to deal with annoying changedirectory usage by generated script.

  * Figure out how to discover an annotation's name in the case that it is not defined in the processed source code and/or referenced jar.

  * check parameters, and emit help if invalid usage. For instance, when no parameters are specified, the program shouldn't emit an empty XML document