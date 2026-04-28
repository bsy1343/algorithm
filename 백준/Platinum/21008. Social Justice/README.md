# [Platinum II] Social Justice - 21008

[문제 링크](https://www.acmicpc.net/problem/21008)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 23, 맞힌 사람: 21, 정답 비율: 34.426%

### 분류

그리디 알고리즘, 정렬, 이분 탐색, 누적 합, 두 포인터, 매개 변수 탐색

### 문제 설명

<p>The local election is over. Your town has got a new mayor and you are his most trusted advisor! During the campaign, you have built his popularity on the promise to <em>bring social justice to the town</em>. Initially having intended this as a slogan not to be dwelled too much into, you were forced by all those pesky journalists to define its precise meaning in the end. You came up with a constant $K &gt; 1$ and stated that social justice will be achieved when nobody earns more than $K$ times the average pay of the town&#39;s residents.</p>

<p>Now the time has come to fulfill that promise. The mayor doesn&#39;t really have any reasonable plan on how to enforce social justice without collapsing the economy but, thankfully, he has come up with a much simpler idea. It will suffice to choose a group of citizens whose salaries fit the definition... and banish everyone else. A flawless plan indeed! Those who remain in the town will get to live in a pure, socially just society. Those who get banished... well, they won&#39;t get a chance to vote in the next election anyway. Simple and effective -- what could possibly go wrong?</p>

<p>Nothing can go wrong, of course, but, for you, things can go even better! The mayor is determined to banish as few people as possible to achieve the goal, but if there is more than one possible way to do it, you will surely be able to influence the choice. Clearly, it won&#39;t hurt to talk to the citizens beforehand and find out if some of them have anything interesting to offer in exchange for your protection when the decisions are being made.</p>

<p>Here&#39;s the catch, though: if there is no possibility that a given person could be allowed to stay, discussing this with them would be an unnecessary and pointless risk as you couldn&#39;t offer them your protection no matter what. A more pragmatic choice will be to make a list of all such citizens -- and talk with everyone else.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 1000$). The descriptions of the test cases follow.</p>

<p>The first line of every test case contains a single integer $n$ ($1 \leq n \leq 200\,000$) -- the number of the citizens. The citizens are numbered from $1$ to $n$.</p>

<p>The next line contains $n$ integers $a_i$ ($0 \leq a_i \leq 10^9$) -- the citizens&#39; salaries.</p>

<p>The last line contains two integers $p$ and $q$ ($1 \leq q &lt; p \leq 1000$) which define the constant $K := \frac{p}{q}$.</p>

<p>The total number of citizens in all test cases does not exceed $1\,000\,000$.</p>

### 출력

<p>For each test case output a line containing an integer $c$ ($0 \leq c &lt; n$): the number of people who definitely cannot stay in the town. Then output a single line containing $c$ integers: the identifiers of those citizens in an ascending order.</p>

### 힌트

<p>In the first test case, the whole set is not socially just. One can see that for each citizen there exists a socially just set of size 3 containing this citizen. Therefore, someone must get banished, but anyone has a chance not to be this person.</p>

<p>In the second test case, two people must be banished. There are three possibilities: the citizens number 1 and 2 might get banished, or 2 and 4, or 2 and 5. Therefore, it is not possible to build justice with person 2 on board, while every other citizen has a chance to stay.</p>

<p>In the third case, citizens 4 and 5 must clearly get banished -- just look at their outrageous salaries!</p>