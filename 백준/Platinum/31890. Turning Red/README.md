# [Platinum III] Turning Red - 31890

[문제 링크](https://www.acmicpc.net/problem/31890)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 107, 정답: 33, 맞힌 사람: 32, 정답 비율: 42.667%

### 분류

구현, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 플러드 필

### 문제 설명

<p>Mei&rsquo;s parents have spent the last year remodeling their house, but their lighting system is quite complex! Each room in the house has an LED light, which can be set to red, green, or blue, as seen in Figure P.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31890.%E2%80%85Turning%E2%80%85Red/6b4a6263.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31890.%E2%80%85Turning%E2%80%85Red/6b4a6263.png" data-original-src="https://upload.acmicpc.net/8d9280ee-fe85-446b-8be6-87a2801be7bf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 517px; height: 100px;" /></p>

<p style="text-align: center;">Figure P.1: The initial state of the lights in Sample Input 1. Buttons and wires not shown.</p>

<p>Throughout the house are various buttons which are each connected to one or more lights. When a button is pressed, any red lights connected to that button become green, any green lights connected to that button become blue, and any blue lights connected to that button become red. Each button can be pressed multiple times. Because the house was built prior to the invention of crossbar wiring, each light is controlled by at most two buttons.</p>

<p>Mei&rsquo;s favorite color is red, so she wants to turn all of the lights red. Her parents, fearing the buttons will wear out, have asked her to minimize the total number of button presses.</p>

### 입력

<p>The first line of input contains two positive integers $l$ and $b$, where $l$ ($1&le;l&le;2 \cdot 10^5$) is the number of lights and $b$ ($0&le;b&le;2 \cdot l$) is the number of buttons. The second line of input is a string of $l$ characters, all either <code>R</code>, <code>G</code>, or <code>B</code>, where the $i$th character is the initial color of the $i$th light. The next $b$ lines describe the buttons. Each of these lines begins with an integer $k$ ($1&le;k&le;l$), the number of lights controlled by this button. Then $k$ distinct integers follow, the lights controlled by this button. The lights are indexed from $1$ to $l$, inclusive. Each light appears at most twice across all buttons.</p>

### 출력

<p>Output the minimum number of button presses Mei needs to turn all the lights red. If it is impossible for Mei to turn all of the lights red, output <code>impossible</code>.</p>