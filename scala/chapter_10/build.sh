#!/bin/sh

scalac -d target/ \
  Application.scala \
  Spiral.scala \
  foo/ArrayElements.scala \
  foo/Element.scala \
  foo/LineElement.scala \
  foo/UniformElement.scala
