# [Gold V] paintbucket - 34427

[문제 링크](https://www.acmicpc.net/problem/34427)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 24, 정답: 20, 맞힌 사람: 18, 정답 비율: 85.714%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 정렬, 플러드 필

### 문제 설명

<p>After pulling a wrong lever in the lab, you find yourself traveling through time and space. At some point while traveling, you passed out and have now awoken in an office. Around you are plenty of old computers. The person in charge comes over and helps you out. They tell you it's the year 1985 and that you're in the office for some computing company. They're creating a painting program for a new operating system and are struggling to create the latest feature. The person in charge gives you some more information:</p>

<p>"We need your help to create a computer program that implements what we will call the paint bucket. Given an image filled with colors and the location of a click, you need to output a list of coordinates that will be colored by the paint bucket."</p>

<p>"Here is an example. If the user were to click on the upper left red pixel with the paint bucket in Figure 1 (e.g., the user is requesting the red pixels be changed to green), then all of the green pixels in Figure 2 are the ones that would get colored."</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34427.%E2%80%85paintbucket/5ae3de91.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34427-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p style="text-align: center;"><b>Figure 1</b>: The image before the user clicked on the upper left red pixel.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34427.%E2%80%85paintbucket/a9e9ae5f.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34427-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p style="text-align: center;"><b>Figure 2</b>: The image after the user clicked, to change several red pixels to green pixels.</p>

<p>"Here is a more formal description. If the user clicks on a pixel with color $c$, the paint bucket should color every pixel in the same 'group' as the pixel they clicked on. Any two pixels are in the same group if you can draw a path that walks across adjacent pixels while only stepping on pixels of color $c$. You can NOT take diagonal steps. Thus, in our example in the figures, note how all of the red pixels that became green are in the same group. Likewise, all of the blue pixels are in another group and each red pixel that did not change is in a group of its own."</p>

<p>Since you haven't made any plans for today, you decide to stick around and help out this company.</p>

### 입력

<p>The first line contains four integers, separated by spaces: the width of the image, the height of the image, the $x$ coordinate clicked by the user, and the $y$ coordinate clicked by the user. The point $(0, 0)$ is at the top left of the image and the point $(w-1, h-1)$ is at the bottom right of the image. Following this first line, you will then have $h$ lines of input and each of these lines will have $w$ integers (space separated). Each of those integers corresponds to the color $c$ of the pixel at that coordinate. </p>

<p>The width, $w$, will be in the range $1 \leq w \leq 1000$.</p>

<p>The height, $h$, will be in the range $1 \leq h \leq 1000$.</p>

<p>The x coordinate, $x$, will be in the range $0 \leq x \leq w-1$.</p>

<p>The y coordinate, $y$, will be in the range $0 \leq y \leq h-1$.</p>

<p>The color $c$, will be in the range $0 \leq c \leq 100$.</p>

### 출력

<p>You should output one line for each coordinate that changes color due to the click. The two components of the coordinate should be separated by a space. The coordinates should also be ordered in the following way: sort first by the $y$ value and then by the $x$ value.</p>