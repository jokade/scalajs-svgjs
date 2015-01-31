// -   Project: scalajs-svgjs (https://github.com/jokade/scalajs-svgjs)
// Description: Scala.js bindings for the svg.js SVG object
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package biz.enef.svgjs

import scala.scalajs.js


object SVG extends js.Object {

  def apply(element: String) : Doc = js.native

  /**
   * Returns true if SVG is supported by the JS environment
   */
  def supported : Boolean = js.native

}
