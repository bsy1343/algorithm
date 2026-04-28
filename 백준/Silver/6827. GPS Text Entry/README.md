# [Silver IV] GPS Text Entry - 6827

[문제 링크](https://www.acmicpc.net/problem/6827)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 33, 맞힌 사람: 31, 정답 비율: 79.487%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>For her birthday, Sandy got a Global Positioning System (GPS) unit, which is an electronic device she can use to track the local hiking trails. Along the way Sandy can mark waypoints that can be recorded on a map when she gets home. A description of each waypoint can be entered in the unit, however the device does not have a keypad. Instead it has four cursor buttons, up, down, left, and right, and a button to accept the letter. The keypad looks like the following:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6827.%E2%80%85GPS%E2%80%85Text%E2%80%85Entry/1b32bcae.png" data-original-src="https://upload.acmicpc.net/536781ab-4e7d-4b7d-9843-a86be18b0616/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 162px; height: 68px;" /></p>

<p>The screen displays a grid of the letters and symbols that can be used to &ldquo;type out&rdquo; the description. Here is the layout of the grid:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6827.%E2%80%85GPS%E2%80%85Text%E2%80%85Entry/b01fdc27.png" data-original-src="https://upload.acmicpc.net/b01dd6ce-0be3-4ecc-b943-a2977e0136e0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 358px; height: 108px;" /></p>

<p>When you enter the name of the waypoint, the cursor starts at the A. You must move the cursor to the location of the next letter or symbol and then accept that letter. The cursor can only move to squares which are adjacent horizontally or vertically (not diagonally). Once you have entered all the letters in the description, you need to move the cursor to &rdquo;enter&rdquo; and accept the entire phrase.</p>

<p>You are to write a program that will calculate the number of cursor movements it takes to &ldquo;type in&rdquo; a phrase. For example, to enter the word &ldquo;GPS&rdquo;, starting from the &ldquo;A&rdquo; position, you would move down 1 to select &ldquo;G&rdquo;, then move right 3 and down 1 to select &ldquo;P&rdquo;, then move down 1 and left 3 to select &ldquo;S&rdquo; and finally move down 1 and right 5 to select &ldquo;enter&rdquo;. This is a total of 15 cursor movements. Note that the total number of cursor movements does not change if you choose to move down and then across or across and then down. Also note that you cannot move beyond the boundaries of the grid (e.g., you cannot move off the grid nor &ldquo;wrap-around&rdquo; the grid).</p>

### 입력

<p>The input for your program will be a string of at most 40 characters. You may assume that all characters in the string are contained in the grid.</p>

### 출력

<p>The output for your program will be an integer that is the total number of cursor movements needed to enter the string using the grid layout given.</p>