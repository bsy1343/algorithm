# [Platinum I] 계산왕 연산군 - 3519

[문제 링크](https://www.acmicpc.net/problem/3519)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 13, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 구현, 수학

### 문제 설명

<p>\(\odot : \left\{0, 1, \dots , 9 \right\} \times \left\{0, 1, \dots , 9 \right\} \rightarrow \left\{0, 1, \dots , 9 \right\} \) 인 연산자 \(\odot\)가 있다. 이 연산자는 \(0 \odot 0 = 0\)&nbsp;을 만족한다고 한다.</p>

<p>또다른 연산자 \(\otimes : \mathbb{Z}_{0+} \times \mathbb{Z}_{0+} \rightarrow \mathbb{Z}_{0+}\)&nbsp;는 연산자 \(\odot\) 을 이용해서 정의가 가능한데, \(a \otimes b\) 는 각 자리수마다 (\(a\)의 i번째 자리 수) \(\odot\)&nbsp;(\(b\)의 i번째 자리 수) 의 결과값을 i번째 자리 수로 사용한 숫자가 결과값이 된다.</p>

<p>예를 들어 \(a \odot b (a \times b) % 10\) 으로 정의되었다면 \(5566 \otimes&nbsp;239\) 의 결과값을 구하는 과정은 아래와 같다.</p>

<p style="text-align:center">\( \begin{align*} 5566&amp; \\ \underline{\otimes \quad 239}&amp; \\ ????&amp; \end{align*} \) &rarr; &nbsp;\( \begin{align*} 5566&amp; \\ \underline{\otimes \quad 0239}&amp; \\ ????&amp; \end{align*} \) &rarr; \( &nbsp;\begin{align*} 5&amp; \\ \underline{\odot \quad 0}&amp; \\ 0&amp; \end{align*} \) \( \begin{align*} 5&amp; \\ \underline{\odot \quad 2}&amp; \\ 0&amp; \end{align*} \) \( \begin{align*} 6&amp; \\ \underline{\odot \quad 3}&amp; \\ 8&amp; \end{align*} \) \(\begin{align*} 6&amp; \\ \underline{\odot \quad 9}&amp; \\ 4&amp; \end{align*} \) &rarr; \( &nbsp;\begin{align*} 5566&amp; \\ \underline{\otimes \quad 0239}&amp; \\ 0084&amp; \end{align*} \) &rarr; \( &nbsp;\begin{align*} 5566&amp; \\ \underline{\otimes \quad 239}&amp; \\ 84&amp; \end{align*} &nbsp;\)</p>

<p>연산자 \(\odot\)의 내용과 두 음이아닌 정수 \(a\), \(b\)가 주어졌을 때 (\(a \le b\)),&nbsp;\(a \otimes (a + 1) \otimes (a + 2) \otimes \dots \otimes (b - 1) \otimes b\) 를 구하여라.</p>

<p>\(\otimes\)연산자의 계산 순서는 왼쪽부터 계산한다. 즉, \(a \otimes b \otimes c\)&nbsp;= \((a \otimes b) \otimes c\)로 취급한다.</p>

### 입력

<p>첫 10줄 각각에는 10개의 수가 주어진다. \(i\)번째 줄의 \(j\)번째 숫자는 \((i&minus;1) \odot (j&minus;1)\) 의 결과값을 나타낸다. \(0 \odot 0\) 은 항상 \(0\)이다.</p>

<p>이어 11번째 줄에는 2개의 정수 \(a\) \(b\)가 주어진다. (0 &le; \(a\) &le; \(b\) &le; 10<sup>18</sup>)</p>

### 출력

<p>\(a\)부터 \(b\)까지 모든 수를 \(\otimes\) 연산한 결과값을 출력한다. 불필요한 0은 출력하지 않는다.</p>