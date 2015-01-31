// -   Project: scalajs-svgjs (https://github.com/jokade/scalajs-svgjs)
// Description: Test cases for trait Element
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package test

import utest._

object ElementTest extends TestSuite {
  override val tests = TestSuite {
    val svg = Utils.createSVG()
    val elem = Utils.createElement(svg)

    'x-{
      assert( elem.x() == 0 )
      elem.x(50)
      assert( elem.x() == 50 )
    }

    'y-{
      assert( elem.y() == 0 )
      elem.y(50)
      assert( elem.y() == 50 )
    }

    'cx-{
      assert( elem.cx() == 50 )
      elem.cx(100)
      assert( elem.cx() == 100 )
    }

    'cy-{
      assert( elem.cy() == 50 )
      elem.cy(100)
      assert( elem.cy() == 100 )
    }

    'move-{
      assert( elem.x() == 0, elem.y() == 0 )
      elem.move(42.1F,84.2F)
      assert( elem.x() == 42.1F, elem.y() == 84.2F )
    }

    'center-{
      assert( elem.cx() == 50, elem.cy() == 50 )
      elem.center(42.1F,84.2F)
      assert( elem.cx() == 42.1F, elem.cy() == 84.2F )
    }

    'width-{
      assert( elem.width() == 100 )
      elem.width(200.5F)
      assert( elem.width() == 200.5 )
    }

    'height-{
      assert( elem.height() == 100 )
      elem.height(200.5F)
      assert( elem.height() == 200.5 )
    }

    'size-{
      assert( elem.width() == 100, elem.height() == 100 )
      elem.size(50.1F,200.2F)
      assert( elem.width() == 50.1F, elem.height() == 200.2F )
    }

    'clone-{
      val c = elem.clone()
      c.x(100)
      assert( elem.x() == 0, c.x() == 100 )
    }

    'doc-{
      assert( elem.doc() == svg )
    }

    'attr-{
      assert( elem.attr[Int]("x") == 0 )
      elem.attr("x",42)
      assert( elem.attr[Int]("x") == 42 )
    }

    'style-{
      assert( elem.style("cursor") == "" )
      elem.style("cursor","pointer")
      assert( elem.style("cursor") == "pointer" )
    }

    'inside-{
      assert(
        elem.inside(-10,0) == false,
        elem.inside(50,50) == true
      )
    }
  }
}
