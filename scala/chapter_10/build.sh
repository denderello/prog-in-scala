#!/bin/sh

scalac -d target/ \
  Application.scala \
  foo/ArrayElements.scala \
  foo/Element.scala \
  foo/LineElement.scala \
  foo/UniformElement.scala