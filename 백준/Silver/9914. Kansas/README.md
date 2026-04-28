# [Silver II] Kansas - 9914

[문제 링크](https://www.acmicpc.net/problem/9914)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 16, 맞힌 사람: 16, 정답 비율: 35.556%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The road map of Kansas, USA, is a grid where there are straight roads North-South and straight roads East-West each 1 mile apart. &nbsp;A truck driver gets instructions in the following form. &nbsp;Drive for two hours north at 45 miles per hour, then for 5 hours west at 65 miles per hour, etc. &nbsp;The driver will have to take a break of 1 hour after 5 hours of continuous driving. &nbsp;The aim is to compute, after how many breaks the driver for the first time passes through or finally returns to the place where she started from.</p>

### 입력

<p>The first line contains an integer (&le; 1000) which is the number of instructions, followed by one line for each instruction, indicating the direction, the number of hours h (1 &le; h &le; 200) and the speed s (1 &le; s &le; 200) in miles per hour in this order. &nbsp;The geographical directions are indicated by the position of the small hand on an analog clock; 12 stands for north, 6 for south, 9 for west, and 3 for east.</p>

### 출력

<p>The output contains an integer which is the number of breaks taken before the driver for the first time passes through or finally returns to the place where she started from. &nbsp;If the driver does not reach or pass through the place where she started from after following all instructions, the output file should contain the number -1.</p>

### 힌트

<p>Example 1. &nbsp;Drive for two hours south at 30 miles per hour, then for four hours west at 40 miles per hour, then for three hours north at 20 miles per hour, then for six hours east at 60 miles per hour, then for five hours north at 30 miles per hour, and then for six hours south at 60 miles per hour.</p>

<p>When following these instructions, the driver will be passing through where she started from after taking two breaks.</p>

<p>Example 2. &nbsp;Drive for one hour south at 30 miles per hour, then for two hours west at 40 miles per hour, then for one hour north at 30 miles per hour, then for one hour east at 79 miles per hour, and then for five hours north at 30 miles per hour.</p>

<p>When following these instructions, the driver will neither pass through nor be back where she started from.</p>

<p>Example 3. &nbsp;Drive for four hours west at 60 miles per hour, then drive for eight hours north at 80 miles per hour, then drive for four hours east at 60 miles per hour, then drive for eight hours south at 100 miles per hour, then drive for ten hours east at 20 miles per hour.</p>

<p>When following these instructions, the driver will pass through where she started from after taking 4 breaks.</p>