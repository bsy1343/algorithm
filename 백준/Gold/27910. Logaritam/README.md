# [Gold III] Logaritam - 27910

[문제 링크](https://www.acmicpc.net/problem/27910)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 20, 맞힌 사람: 17, 정답 비율: 68.000%

### 분류

수학, 정수론

### 문제 설명

<p>Hrvoje has recently learned about the logarithm function. He really likes the property $\log(xy) = \log(x) + \log(y)$, for each pair of positive real numbers $x$ and $y$.</p>

<p>He is actually not interested in the function itself, but in logarithmic sequences. A logarithmic sequence of length $n$ is a sequence of real numbers $(a_1, a_2, \dots , a_n)$ for which $a_{xy} = a_x + a_y$ holds for every pair of positive integers $x$ and $y$ such that $xy &le; n$. An example of a logarithmic sequence of length $6$ is $0, 1, &pi;, 2, 0.7, 1 + &pi;$.</p>

<p>For his homework, Hrvoje needed to write $q$ logarithmic sequences of length $n$, however, after a long night of effort he woke up just to find out that Matej had changed exactly one element of each sequence. Hrvoje doesn&rsquo;t have a lot of time to correct his homework, so he is interested in the least number of elements of each sequence he needs to change so the sequence becomes logarithmic again. Unfortunately, Matej had written his element with a pen, so Hrvoje <strong>cannot</strong> change that element of the sequence.</p>

<p>Hrvoje has forgotten which sequences he wrote for his homework so the only thing he knows is the number of sequences $q$, the length of each sequence $n$ and the position $x_i$ of the element Matej had changed in the i-th sequence.</p>

<p>Note: It can be proven that for any starting logarithmic sequence the minimal number of changes is the same.</p>

### 입력

<p>In the first line there are two positive integers $n$ and $q$ ($1 &le; n &le; 10^8$, $1 &le; q &le; 10^4$), the length of each sequence and the number of sequences.</p>

<p>In the $i$-th of the next $q$ lines there is a positive integer $x_i$ ($1 &le; x_i &le; n$), the index of the element Matej had changed in the $i$-th sequence.</p>

### 출력

<p>In the $i$-th line output <code>-1</code> if Hrvoje cannot change the other elements of the $i$-th sequence such that the sequence becomes logarithmic again, otherwise output the minimal number of changes needed to make the sequence logarithmic again.</p>

### 힌트

<p>Clarification of the first example: If the starting sequence was $0, 1, &pi;, 2, 0.7, 1 + &pi;$ and Matej changes the fourth element to $8$, Hrvoje can change the second element to $4$ and the sixth to $4 + &pi;$, after which the sequence $0, 4, &pi;, 8, 0.7, 4 + &pi;$ will be logarithmic again.</p>