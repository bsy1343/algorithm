# [Silver V] Coffee - 18706

[문제 링크](https://www.acmicpc.net/problem/18706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 281, 정답: 163, 맞힌 사람: 140, 정답 비율: 57.851%

### 분류

수학, 구현, 자료 구조, 문자열, 집합과 맵, 사칙연산, 해시를 사용한 집합과 맵

### 문제 설명

<p>Given the prices of different types of coffee (latte, cappuccino, &middot; &middot; &middot;) for each size (small, medium, and large), and a list of orders of a group of persons. Your task is to find how much will each person pay eventually. The cost that a person needs to pay is the cost of coffee he/she ordered in addition to the delivery fees. The delivery fees for each person are 100\$ divided by the number of persons (rounded down).</p>

<p>Eventually, the final cost should ignore 1\$ greater or less than what should be paid to the nearest multiple of 5 (i.e 44\$ and 46\$ will be rounded to 45\$. However, 47\$ and 48\$ will not be changed).</p>

### 입력

<p>The first line of the input contains a single integer T specifying the number of test cases.</p>

<p>Each test case begins with a line containing two integers C and P (1 &le; C, P &le; 100), in which C is the number of different types of coffees, and P is the number of unique persons.</p>

<p>Then C lines follow, giving the coffee types. Each line contains a string N and three integers S, M, and L (1 &le; S, M, L &le; 100), in which N is a coffee name, S, M, and L are the prices for small, medium, and large sizes, respectively. Each coffee type will appear exactly once per test case.</p>

<p>Then P lines follow, giving the list of orders. Each line contains three strings X, Y , and Z, in which X is a person name, Y is the coffee size (Y &isin; {small, medium, large}), and Z is a coffee name. It is guaranteed that all the given P names are distinct, and each person will order coffee type that exists.</p>

<p>Both the coffee and person names are non-empty strings consisting of lowercase and uppercase English letters with a length of no more than 15 letter.</p>

### 출력

<p>For each test case, print P lines in which each line contains two space-separated values, the name of the person and the total cost he/she will pay for his/her order. Print the persons in the same order as given in the input.</p>

### 힌트

<p>The delivery fees is 100\$ and divided by 3 persons, so each of them will pay &lfloor;100/3&rfloor; = 33\$.</p>

<ul>
	<li>The cost for &ldquo;Mohammed&rdquo; is 34\$ for drinks, 33\$ for delivery fees, this will be 67\$, which is the final cost.</li>
	<li>The cost for &ldquo;Mostafa&rdquo; is 38\$ for drinks, 33\$ for delivery fees, which will be 71\$, then 1\$ is ignored to the nearest multiple of 5, so the final cost is 70$.</li>
	<li>The cost for &ldquo;Ahmad&rdquo; is 26\$ for drinks, 33\$ for delivery fees, which will be 59\$, then 1\$ is ignored to the nearest multiple of 5, so the final cost is 60\$.</li>
</ul>