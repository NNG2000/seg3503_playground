defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """
  def percentage_grade do
    double r =  Enum.random(); 
  end
  def letter_grade do
    "todo"
  end
  def numeric_grade do
    "todo"
  end
  
end
