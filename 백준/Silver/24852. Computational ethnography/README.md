# [Silver IV] Computational ethnography - 24852

[문제 링크](https://www.acmicpc.net/problem/24852)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 62, 맞힌 사람: 46, 정답 비율: 48.421%

### 분류

수학, 구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Native inhabitants of the L Island write numbers the other way round: most significant digits of a number are written in the end. For instance, number $144$ is written as $441$.</p>

<p>Novice ethnographer-mathematician Petya is studying square numbers and the culture of Island L&#39;s natives. He noticed that some numbers are perfect squares when considered both as regular numbers and as written by Island L&#39;s native inhabitants. For instance, number $144$ mentioned above is such a number: when considered as written in usual way $144 = 12^2$ and when considered as number $441$ written by natives, then $441 = 21^2$. Petya calls such numbers <em>interesting</em>.</p>

<p>Petya is interested how many interesting numbers there are from $A$ to $B$ inclusive.</p>

### 입력

<p>The first line of input contains integer $A$, the second line of input contains integer $B$ ($1 \le A \le B \le 10^{11}$).</p>

### 출력

<p>Output the number of interesting numbers from $A$ to $B$.</p>

### 힌트

<p>In the first sample test interesting numbers are $1$, $4$, $9$, $121$, $144$, $169$, $441$, $484$, $676$ and $961$. Island L&#39;s native inhabitants don&#39;t use leading zeros when writing numbers, so $100$ is not an interesting number.</p>