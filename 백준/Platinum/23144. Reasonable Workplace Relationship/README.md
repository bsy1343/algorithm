# [Platinum II] Reasonable Workplace Relationship - 23144

[문제 링크](https://www.acmicpc.net/problem/23144)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 57, 정답: 17, 맞힌 사람: 16, 정답 비율: 30.769%

### 분류

수학, 자료 구조, 정렬, 트리, 정수론, 세그먼트 트리, 모듈로 곱셈 역원, 오일러 경로 테크닉, 머지 소트 트리

### 문제 설명

<p>The subordinates must obey the orders of the superiors unconditionally. If there is any objection, they can say it later. &quot;If you throw the pot up and down to the subordinates, they can only accept it with patience and full of grievances&quot;... Do these words often seen in the workplace novels really reflect the current situation? Let us turn to a more specific simplified model.</p>

<p>Now, we have a workplace relationship model, which is a superior--subordinate relationship. Let us assume that there is only one big boss. Since they are called the big boss, they naturally have no superior. The big boss has some subordinates who are directly managed by them, and these subordinates have their own subordinates... Repeat several times like this, and we can clearly see that this model is a rooted tree. There are $n$ people in the model, numbered from $1$ to $n$. The superior of person $i$ is the parent of node $i$, and the big boss is the root of the tree. We will give each person $i$ an integer $a_i$ to measure their ability.</p>

<p>A <em>group</em> consists of a person, which is called the <em>leader</em> of the group, along with all their direct and indirect subordinates. Clearly, a group corresponds to some subtree, and the group leader is the root of that subtree. We know that the management of subordinates by leaders should not be based only on the ability of leaders and subordinates, which is too narrow and not conducive to management. Because of their special status as leaders, leaders obviously still have the so-called prestige to help them manage. So we will give each person $i$ an integer $w_i$ to measure their prestige.</p>

<p>With prestige and certain ability, leadership can convince the public. Unfortunately, there are always some subordinates whose ability value ($a_i$) is greater than the sum of the leader&#39;s ability and prestige, and this is very bad. No matter how open-minded a leader is, there will always be some discomfort in their heart.</p>

<p>In order to simplify the problem, consider a group with leader $i$. Let the subtree rooted at $i$ have $s_i$ nodes. Let $k_i$ be the number of such nodes $j$ in this subtree that satisfy $a_j &gt; a_i + w_i$. Then person $i$ has the probability of $k_i / s_i$ of becoming unhappy as a leader (leaders are simple, they are either happy or unhappy). The probabilities for different people are independent.</p>

<p>Now, in order to measure the reasonableness of the company&#39;s workplace relationship structure, let us look at some groups. Specifically, we have to answer $m$ questions. For question $i$, consider the group led by person $x_i$. We have to count the expected number of people in this group that will be happy as leaders.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($2 \le n \le 3 \cdot 10^5$, $1 \le m \le 3 \cdot 10^5$).</p>

<p>The next line contains $n$ integers $p_1, p_2, \ldots, p_n$, where $p_i$ denotes the superior of person $i$. If $p_i = 0$, the i-th person has no superior, and is the big boss. It is guaranteed that there is exactly one big boss, but it is <strong>not</strong> guaranteed that the boss is the person number $1$. It is also guaranteed that the superior--subordinate relationships form a rooted tree.</p>

<p>The following line contains $n$ integers $a_1, a_2, \ldots, a_n$ denoting the ability of each person ($1 \le a_i \le 10^9$).</p>

<p>The subsequent line contains $n$ integers $w_1, w_2, \ldots, w_n$ denoting the prestige of each person ($1 \le w_i \le 10^9$).</p>

<p>The $i$-th of the following $m$ lines contains one integer $x_i$, asking how many people in the group led by $x_i$ are expected to be happy.</p>

### 출력

<p>Print $m$ lines, with one integer on each: the answers to the queries.</p>

<p>Since the result of a query may not be an integer, you need to output the values modulo $10^9 + 7$.</p>

<p>Formally, it can be shown that the answer can be represented as a fraction $p / q$ for some coprime non-negative integers $p$ and $q$. You have to print the value $p \cdot q^{-1} \bmod (10^9 + 7)$.</p>

### 힌트

<p>Person $1$ will be happy with probability $1 / 2$. Person $2$ will always be happy.</p>