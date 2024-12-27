# Incorrect Usage of foldLeft in Scala

This repository demonstrates a common error when using the `foldLeft` function in Scala. The example showcases how attempting to directly modify the accumulator variable within the foldLeft function leads to unexpected results.

The `bug.scala` file contains the erroneous code, while `bugSolution.scala` provides the correct implementation.

## Problem

The primary problem lies in how the accumulator (`sum`) is handled.  In the incorrect example, `sum` is modified directly using `acc += elem` inside the foldLeft function; however, this does not update the accumulator correctly, as foldLeft expects a new accumulator value to be returned in each step.

## Solution

The correct approach involves returning a new accumulator value in each iteration of foldLeft by performing calculations directly within the returned value rather than modifying the accumulator variable outside the foldLeft function.  This ensures that foldLeft properly accumulates values across all elements in the list.