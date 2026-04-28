# [Platinum V] Let’s Go to the Movies - 4915

[문제 링크](https://www.acmicpc.net/problem/4915)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 해시를 사용한 집합과 맵, 트리, 집합과 맵

### 문제 설명

<p>A favorite pastime for big families in Acmestan is going to the movies. It is quite common to see a number of these multi-generation families going together to watch a movie. Movie theaters in Acmestan have two types of tickets: A single ticket is for exactly one person while a family ticket allows a parent and their children to enter the theater. Needless to say, a family ticket is always priced higher than a single ticket, sometimes as high as five times the price of a single ticket.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4915/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-10%20%EC%98%A4%ED%9B%84%204.26.37.png" style="height:153px; width:242px" /></p>

<p>It is quite challenging for families to decide which ticket arrangement is most economical to buy. For example, the family depicted in the figure on the right has four ticket arrangements to choose from: Seven single tickets; Two family tickets; One family ticket (for adam, bob, cindy) plus four single tickets for the rest; Or, one family ticket (for bob and his four children) plus single tickets for the remaining two.</p>

<p>Write a program to determine which ticket arrangement has the least price. If there are more than one such arrangement, print the arrangement that has the least number of tickets.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of each test case includes two positive integers (S and F) where S is the price of a single ticket and F is the price of a family ticket. The remaining lines of the test case are either the name of a person going by him/herself, or of the form:</p>

<p>N<sub>1</sub> N<sub>2</sub> N<sub>3</sub> ... N<sub>k</sub></p>

<p>where N1 is the name of a parent, with N<sub>2</sub> . . . N<sub>k</sub> being his/her children. Names are all lower-case letters, and no longer than 1000 characters. No parent will be taking more than 1000 of their children to the movies :-). Names are unique, the name of a particular person will appear at most twice: Once as a parent, and once as a child. There will be at least one person and at most 100,000 people in any test case.</p>

<p>The end of a test case is identified by the beginning of the following test case (a line made of two integers.) The end of the last test case is identified by two zeros.</p>

### 출력

<p>For each test case, write the result using the following format:</p>

<p>k.␣NS␣NF␣T</p>

<p>Where k is the test case number (starting at 1,) ␣ is a single space, NS is the number of single tickets, NF is the number of family tickets, and T is the total cost of tickets.</p>