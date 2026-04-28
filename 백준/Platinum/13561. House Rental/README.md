# [Platinum IV] House Rental - 13561

[문제 링크](https://www.acmicpc.net/problem/13561)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1192, 정답: 224, 맞힌 사람: 159, 정답 비율: 19.203%

### 분류

두 포인터

### 문제 설명

<p>Acmi is a medium-sized city, through which there is a long main street from the west to the east. All facilities in Acmi, such as supermarkets, schools, train stations, bus stops, and hospitals, are located on the main street. You are going to rent a house in Acmi that is on the main street. You think the location is the most priority in choosing your house. In particular, you have a list of k facility types and want to minimize the distance to each facility. For example, if you think supermarket is important and so it is in your list of k facility types, then you want your house to be located close to a supermarket.</p>

<p>If k = 1, then the problem is easy because you will rent a house just in front of any facility of the type you want. But in general cases where k &gt; 1, this strategy may not work.</p>

<p>Given n facilities of k different types along the main street, you are to write a program that finds a best location of your house that minimizes the maximum among the distances to the nearest facility of each type. The location of every building along the main street is represented by an integer from &minus;1,000,000,000 to 1,000,000,000. The smaller location number a building on the street has, the more to the west it is located along the street. The distance between two buildings is considered to be exactly the difference of their location numbers. Note that there may be two or more facilities at a common location, and that there is at least one facility with each of the k facility types. Assume that there is at least one vacant house you can rent at every integral location number.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers k (1 &le; k &le; 100, 000) and n (k &le; n &le; 1, 000, 000), where n is the number of facilities along the main street and k is the number of different facility types. In the following n lines, the location of each of the n facilities and its type are given line by line in the form of two integers: the first integer represents the location between &minus;1, 000, 000, 000 and 1, 000, 000, 000, inclusively, along the street, and the second integer between 1 to k represents the type.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for the input. The line should contain an integer that represents a best location of your house for the input. If there are two or more best locations, then you must output the smallest location number among them.</p>