# [Gold I] Circles on a Screen - 3552

[문제 링크](https://www.acmicpc.net/problem/3552)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 29, 정답: 19, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

기하학, 스위핑

### 문제 설명

<p>Yesterday Andrew wrote a program that draws $n$ white circles on a black screen. The screen is monochrome and it has a resolution $w \times h$ pixels. Pixels are numbered from upper left corner $(0, 0)$ to bottom right one $(w-1, h-1)$.</p>

<p>A circle with the center at pixel $(x_c, y_c)$ and the radius $r$ consists of the pixels with coordinates $(x, y)$ such that $\sqrt{(x_c - x)^2 + (y_c - y)^2} \le r$. If the circle does not fit on the screen, it is truncated. If some pixel belongs to two or more circles, it is white.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3552.%E2%80%85Circles%E2%80%85on%E2%80%85a%E2%80%85Screen/20304552.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3552.%E2%80%85Circles%E2%80%85on%E2%80%85a%E2%80%85Screen/20304552.png" data-original-src="https://upload.acmicpc.net/72a570bf-ace4-4697-9521-3b2786edc86f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 239px; height: 181px;" /></p>

<p>The resulting picture was very nice, so Andrew decided to copy it to his wall. He has white wallpaper and he can only draw some parts of wall into black. Now he wants to know the amount of paint he needs. He copies the picture exactly pixel-to-pixel, so you should write a program that calculates the number of black pixels left on a screen after drawing $n$ circles.</p>

### 입력

<p>In the first line of input file there are three integers: $w$, $h$, and $n$ ($1 \le w, h \le 20\,000$; $1 \le n \le 100$). Each of the following $n$ lines contains descriptions of the circle. In $i+1$-th line there are three integers: $x_i$, $y_i$, $r_i$ ($0 \le x_i &lt; w$; $0 \le y_i &lt; h$; $0 \le r_i \le 40\,000$). They denote a circle with the center at pixel $(x_i, y_i)$ and radius $r_i$.</p>

### 출력

<p>You should output exactly one number --- the number of black pixels left on the screen.</p>

### 힌트

<p>The picture corresponds to the second example.</p>