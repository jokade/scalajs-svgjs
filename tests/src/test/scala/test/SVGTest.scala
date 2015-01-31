// -   Project: scalajs-svgjs (https://github.com/jokade/scalajs-svgjs)
// Description: Tests the bindings to SVG
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package test

import biz.enef.svgjs.SVG
import utest._

import scala.scalajs.js

object SVGTest extends TestSuite {
  override val tests = TestSuite {
    'supported-{
      assert( SVG.supported )
    }

    'apply-{
      val (div,id) = Utils.createDiv()
      val svg = SVG(id)
      assert( Utils.getSVGRoot(div).viewport.x == 0 )
    }
  }
}
