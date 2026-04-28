# [Platinum V] Candy - 21329

[문제 링크](https://www.acmicpc.net/problem/21329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

그리디 알고리즘, 비트마스킹

### 문제 설명

<p>It is Saturday and Ann Britt-Caroline is going to buy candy. She has identified several different bags of candy she is considering buying.</p>

<p>Each bag contains a number of pieces of candy of different types. There are 10 types of normal candy (these are numbered $1...10$), and 10 types of anti-candy (numbered $-1...-10$). It just so happens that candy of type $n$ and type $-n$ do not go well together - they are annihilated if they come in contact with each other. Other than that anti-candy tastes just the same as normal candy.</p>

<p>When Ann Britt-Caroline has bought the bags of candy she mixes them in a big bowl such that all pairs of candy/anti-candy is annihilated (she mixes thoroughly). How many pieces of candy can Ann Britt-Caroline have left (after all pairs of candy/ant-candy is annihilated), if she selects her bags of candy optimally? Note that she can only buy one bag of each type. Ignore any money related issues - her parents will pay.</p>

### 입력

<p>The first line in the input consist of an integer $1 \le N \le 1000$ - the number of bags of candy.</p>

<p>The following $n$ lines describe each bag of candy. Each line starts with an integer $1 \le k \le 10$, specifying the number of different types of candy in the bag. Then follow $k$ pairs of integers $s$ $n$, which means that there are $n$ pieces of candy type $s$. Each type of candy is mentioned at most once per bag, and types $s$ and $-s$ can not be in the same bag.</p>

<p>For all $n$, $1 \le n \le 1000$.</p>

### 출력

<p>Print an integer: the largest amount of candy Ann Britt-Caroline can have in the end.</p>

### 제한

<ul>
	<li>$N \le 1000$</li>
</ul>