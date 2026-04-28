# [Platinum II] Short Function - 32065

[문제 링크](https://www.acmicpc.net/problem/32065)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 33, 맞힌 사람: 29, 정답 비율: 60.417%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>Last week, your algorithm course&rsquo;s lecturer gave you an assignment to determine the output of a given pseudocode function. Even though the assignment contains only a single problem, the lecturer warned you not to underestimate it and suggests you spend more time doing it.</p>

<p>The following is the snapshot of the assignment that you need to finish before the deadline.</p>

<hr />
<p>Given an array of positive integers <code>A[]</code> of length <code>N</code> (indexed from <code>0</code> to <code>N-1</code>), an integer <code>K</code>, and the following pseudocode function. Your task in this problem is to determine the output of the following function from the given input.</p>

<pre>
SomeFunction(A[0..N-1], N, K):
    B[0..N-1] = A[0..N-1]
    for i = 0 to K-1:
        A[0..N-1] = B[0..N-1]
        for j = 0 to N-1:
            B[j] = A[j] &times; A[(j + 2<sup>i</sup>) mod N]
    return B[0..N-1]
</pre>

<p>What is the output of the function (i.e. what are the values for <code>B[0..N-1]</code>)? Please ask your teaching assistant for the input <code>A[]</code>, <code>N</code>, and <code>K</code>.</p>

<p>IMPORTANT: As the return value for <code>B[0..N-1]</code> can be very large, it can be very troublesome to verify, so you must modulo each element of <code>B[0..N-1]</code> by <code>998 244 353</code>.</p>

<hr />
<p>As the problem looks short and easy, you decided to leave the assignment to the last minute before the submission deadline. You managed to get the required input (the array $A$, integer $N$, and integer $K$) from the teaching assistant, but you quickly regret your lazy decision after implementing the function pseudocode. Apparently, a direct implementation of the function might need hours to run.</p>

<p>Now you need to calm down and figure out the output of the function given such input before the deadline.</p>

### 입력

<p>Input begins with two integers $N$ $K$ ($1 &le; N &le; 100\, 000$; $1 &le; K &le; 10^9$) representing the size of input array $A$ and the given integer, respectively. The next line contains $N$ integers $A_i$ ($1 &le; A_i &lt; 998\, 244\, 353$) representing the elements of array $A$.</p>

### 출력

<p>Output $N$ integers in a single line, each separated by a single space, representing the output of the function (i.e. the array <code>B[]</code>). Modulo each element in <code>B[]</code> by $998\, 244\, 353$. See sample output for clarity.</p>