// -   Project: scalajs-svgjs (https://github.com/jokade/scalajs-svgjs)
// Description: Utilities for tests
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package test

import biz.enef.svgjs.{Doc, Element, SVG}
import org.scalajs.dom

import scala.scalajs.js

object Utils {
  private var _nextId = 1

  /**
   * Appends a new div with the specified ID to the document body
   *
   * @param id
   * @return
   */
  def appendDiv(id: String) = {
    val div = dom.document.createElement("div")
    div.setAttribute("id",id)
    dom.document.body.appendChild(div)
    div
  }

  /**
   * Creates a new div and returns a tuple containing the div and the ID of the div
   */
  def createDiv() : (dom.Element,String) = {
    val id = s"id${_nextId}"
    val div = appendDiv(id)
    (div,id)
  }

  def getSVGRoot(elem: dom.Element) : dom.SVGSVGElement = elem.children.item(0).asInstanceOf[dom.SVGSVGElement]

  def createSVG() : Doc = {
    val (div,id) = createDiv()
    SVG(id)
  }

  def createElement(svg: Doc) : Element = {
    svg.asInstanceOf[js.Dynamic].rect(100,100).asInstanceOf[Element]
  }

  def removeElement(elem: dom.Element) = {
    dom.document.body.removeChild(elem)
  }

}
