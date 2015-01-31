// -   Project: scalajs-svgjs (https://github.com/jokade/scalajs-svgjs)
// Description: Bindings for svg.js Element
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package biz.enef.svgjs

import scala.scalajs.js

trait Element extends js.Object {

  /**
   * Returns the x-coordinate of the upper left corner.
   */
  def x() : Float = js.native

  /**
   * Moves the element along the x-axis by its upper left corner.
   */
  def x(x: Float) : Float = js.native

  /**
   * Returns the y-coordinate of the upper left corner.
   */
  def y() : Float = js.native

  /**
   * Moves the element along the y-axis by its upper left corner.
   */
  def y(y: Float) : Float = js.native

  /**
   * Returns the x-coordinate of the center.
   */
  def cx() : Float = js.native

  /**
   * Moves the element along the x-axis by its center.
   */
  def cx(x: Float) : Float = js.native

    /**
   * Returns the y-coordinate of the center.
   */
  def cy() : Float = js.native

  /**
   * Moves the element along the y-axis by its center.
   */
  def cy(y: Float) : Float = js.native

  /**
   * Move upper left corner of element to given x and y values
   */
  def move(x: Float, y: Float) : Unit = js.native

  /**
   * Move element by its center to the given x and y values
   */
  def center(x: Float, y: Float) : Unit = js.native

  /**
   * Returns the width of this element
   */
  def width() : Float = js.native

  /**
   * Set the width of this element.
   */
  def width(w: Float) : Float = js.native

  /**
   * Returns the height of this element
   */
  def height() : Float = js.native

  /**
   * Set the height of this element.
   */
  def height(h: Float) : Float = js.native

  /**
   * Set element size to given height and width
   */
  def size(width: Float, height: Float) : Unit = js.native

  /**
   * Creates a new unlinked copy of this element.
   */
  override def clone() : Element = js.native

  /**
   * Removes this element from the drawing
   */
  def remove() : Element = js.native

  /**
   * Replaces this element with the specified element.
   */
  def replace(elem: Element) : Element = js.native

  /**
   * Add element to given container and return self
   */
  def addTo(parent: Container) : Element = js.native

  /**
   * Add element to given container and return container
   */
  def putIn(parent: Container) : Container = js.native

  /**
   * Returns the parent document
   */
  def doc() : Doc = js.native

  /**
   * Get the value of the specified attribute.
   */
  def attr[T](name: String) : T = js.native

  /**
   * Set a single attribute
   */
  def attr(name: String, value: js.Any) : Unit = js.native

  /**
   * Set multiple attributes at once
   */
  def attr(attrs: js.Object) : Unit = js.native

  /**
   * Manage transformations
   */
  def transform(transform: js.Object) : Unit = js.native

  /**
   * Returns the value of the specified style.
   */
  def style(s: String) : String = js.native

  /**
   * Set a single style.
   */
  def style(s: String, value: String) : Unit = js.native

  /**
   * Set multiple styles.
   */
  def style(styles: js.Object) : Unit = js.native

  /**
   * Returns the ID of this element
   */
  def id() : String = js.native

  /**
   * Set the ID of this element
   */
  def id(id: String) : String = js.native

  /**
   * Get the bounding box for this element
   */
  def bbox() : BBox = js.native

  /**
   * Get rect box for this element
   */
  def rbox() : RBox = js.native

  /**
   * Checks whether the specified point is inside the bounding box of this element
   */
  def inside(x: Float, y: Float) : Boolean = js.native

  /**
   * Show element
   */
  def show() : Unit = js.native

  /**
   * Hide element
   */
  def hide() : Unit = js.native
}
