# [Gold I] Series - 7116

[문제 링크](https://www.acmicpc.net/problem/7116)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 26, 맞힌 사람: 23, 정답 비율: 56.098%

### 분류

구현, 수학

### 문제 설명

<p>All the natural numbers from n to m (inclusively) are written in a row without separating symbols, thus creating a series of decimal digits.</p>

<p>For example, if n=98 and m=102, this series is <a href="tel:9899100101102">9899100101102</a>.</p>

<p>Then all the digits are sorted in a non-increasing order - first the greatest digits, then the next greatest, etc.</p>

<p>For the example above this sorted series is <a href="tel:9998211110000">9998211110000</a>.</p>

<p>For the values of natural numbers n,m and k given in the input your task is to compute, which digit will be in the k-th position of the sorted series.</p>

### 입력

<p>The values of three natural numbers n (0 &lt; n &lt; 10<sup>9</sup>), m (0 &lt; m &lt; 10<sup>9</sup>, m &ge;&nbsp;n) and k (0 &lt; k &lt; 10<sup>9</sup>) are input from the keyboard.</p>

### 출력

<p>The digit at the k-th position of the sorted series must be output on the screen. If length of the series is less than k, a single word &ldquo;NAV&rdquo; must be output on the screen.</p>