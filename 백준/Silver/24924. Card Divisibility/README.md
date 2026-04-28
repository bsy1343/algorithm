# [Silver IV] Card Divisibility - 24924

[문제 링크](https://www.acmicpc.net/problem/24924)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 215, 정답: 101, 맞힌 사람: 82, 정답 비율: 45.055%

### 분류

수학, 정수론

### 문제 설명

<p>Since you have learned Modular Arithmetic, you know how to work with quotients and remainders. For every pair of integers $a$ and&nbsp;$m$ with&nbsp;$m&gt;0$, there exist unique integers&nbsp;$q$ and&nbsp;$r$ such that&nbsp;$a=m&sdot;q+r$ and&nbsp;$0&le;r&lt;m$. But this is a bit simple, you wonder if you can do something more interesting with this theory.</p>

<p>Right now, you are holding a handful of consecutive cards numbered from&nbsp;$L$&nbsp;to&nbsp;$R$. You lay the cards out side-by-side to create a single large number (i.e. concatenating the digits of your cards). You would like to know the remainder (which is the&nbsp;$r$&nbsp;in&nbsp;$a=m&sdot;q+r$) when this number is divided by&nbsp;$9$. For example, $L=9$ and&nbsp;$R=11$&nbsp;means you are holding cards&nbsp;$9,10,11$. Concatenating these numbers produces the number&nbsp;$91011$. The remainder&nbsp;$r$&nbsp;left upon dividing this number by&nbsp;$9$&nbsp;would be&nbsp;$r=3$.</p>

### 입력

<p>Input consists of a single line containing two integers $L$&nbsp;($1&le;L&le;10^{12}$) and&nbsp;$R$&nbsp;($L&le;R&le;10^{12}$). This means you are holding the cards with numbers from&nbsp;$L$&nbsp;to&nbsp;$R$, inclusive.</p>

### 출력

<p>Display a single line containing the remainder of the concatenated number if you were to divide it by $9$.</p>