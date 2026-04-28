# [Platinum IV] Counting Friends - 10020

[문제 링크](https://www.acmicpc.net/problem/10020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 128, 정답: 48, 맞힌 사람: 41, 정답 비율: 37.273%

### 분류

그래프 이론, 차수열

### 문제 설명

<p>Farmer John&apos;s N cows (2 &lt;= N &lt;= 500) have joined the social network &quot;MooBook&quot;.</p><p>Each cow has one or more friends with whom they interact on MooBook.  Just for fun, Farmer John makes a list of the number of friends for each of his cows, but during the process of writing the list he becomes distracted, and he includes one extra number by mistake (so his list contains N+1 numbers, instead of N numbers as he intended).</p><p>Please help Farmer John figure out which numbers on his list could have been the erroneous extra number.</p>

### 입력

<ul><li>Line 1: The integer N.</li><li>Lines 2..2+N: Line i+1 contains the number of friends for one of FJ&apos;s cows, or possibly the extra erroneous number.</li></ul>

### 출력

<ul><li>Line 1: An integer K giving the number of entries in FJ&apos;s list that could be the extra number (or, K=0 means that there is no number on the list whose removal yields a feasible pairing of friends).</li><li>Lines 2..1+K: Each line contains the index (1..N+1) within the input ordering of a number of FJ&apos;s list that could potentially be the extra number -- that is, a number that can be removed such that the remaining N numbers admit a feasible set of friendships among the cows.  These lines should be in sorted order.</li></ul>

### 힌트

<h4>Input Details</h4><p>Farmer John has 4 cows.  Two cows have only 1 friend each, two cows have 2 friends each, and 1 cow has 3 friends (of course, one of these numbers is extra and does not belong on the list).</p><h4>Output Details</h4><p>Removal of the first number in FJ&apos;s list (the number 1) gives a remaining list of 2,2,1,3, which does lead to a feasible friendship pairing -- for example, if we name the cows A..D, then the pairings (A,B), (A,C), (A,D), and (B,C) suffice, since A has 3 friends, B and C have 2 friends, and D has 1 friend.  Similarly, removing the other &quot;1&quot; from FJ&apos;s list also works, and so does removing the &quot;3&quot; from FJ&apos;s list.  Removal of either &quot;2&quot; from FJ&apos;s list does not work -- we can see this by the fact that the sum of the remaining numbers is odd, which clearly prohibits us from finding a feasible pairing.</p>