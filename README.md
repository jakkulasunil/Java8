# Java8
Java8 introduced functional interfaces @FunctionalInterface that has exactly one abstract method. 

**Interface**	                  **Signature	**                                       ** Examples**
UnaryOperator<T>	              T apply(T t)	                                String::toLowerCase, Math::tan
BinaryOperator<T>   	        T apply(T t1, T t2)	                            BigInteger::add, Math::pow
Function<T, R>	                 R apply(T t)                  	              Arrays::asList, Integer::toBinaryString
Predicate<T, U>	            boolean test(T t, U u)	                          String::isEmpty, Character::isDigit
Supplier<T>	                      T get()	                                    LocalDate::now, Instant::now
Consumer<T>         	        void accept(T t)	                              System.out::println, Error::printStackTrace
