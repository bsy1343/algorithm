# [Gold IV] Froggie - 16627

[문제 링크](https://www.acmicpc.net/problem/16627)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 135, 정답: 24, 맞힌 사람: 22, 정답 비율: 19.298%

### 분류

구현

### 문제 설명

<p>You are recreating the classic &lsquo;Frogger&rsquo; video game. You do not need to worry about sprites, music, or animation (that is left to the game&rsquo;s art team).</p>

<p>Each level consists of a road with multiple lanes, with cars traveling in both directions. Cars within each lane are evenly-spaced and move at the same speed and in the same direction. Lane directions alternate, with the top lane moving left to right.</p>

<p>&lsquo;Froggie&rsquo; starts below the bottom lane and she travels across the road from the bottom to the top. At each time step, Froggie hops one space in one of four directions: up, down, left, or right. The goal of the game is to get Froggie across the road and above the top lane without her getting hit by a car.</p>

<p><strong>Example</strong></p>

<p>Consider the first sample input, where Froggie hops upward four times. The road has three lanes and a width of 7. Froggie starts below the road in the third cell. Cars in the top and bottom lanes are spaced at an interval of 3, and the middle lane has an interval of 2. The cars in the top two lanes move at a speed of 1, while those in the bottom lane move at a speed of 2. See Figure D.1.</p>

<p>At time 1 Froggie hops upward and the cars move. The cars in the top and middle lanes each move one space, and the cars in the bottom lane each move two spaces. See Figure D.2. After this first hop, Froggie is still safe. She now sits where a car was, and has avoided the path of the car as it travels. Notice that cars exit the simulated area as they travel off the grid, and also new cars also enter (at times that preserve each lane&rsquo;s interval).</p>

<p>At time 2, Froggie hops upward again as the cars continue to move. After hopping into the middle lane, Froggie could move left with this lane&rsquo;s traffic (traffic in this lane moves left at a speed of 1). See Figure D.3.</p>

<p>At time 3, Froggie hops upward a third time, reaching the top lane. See Figure D.4. Finally, at time 4, with a final upward hop, Froggie exits the road to safety. See Figure D.5.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16627.%E2%80%85Froggie/60bf7b17.png" data-original-src="https://upload.acmicpc.net/3658f4c9-7e07-4061-9dca-eed4afb14f64/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 449px; height: 92px;" /></p>

<p style="text-align: center;">Figure D.1: Time 0. Cars and Froggie in their initial positions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16627.%E2%80%85Froggie/fa452933.png" data-original-src="https://upload.acmicpc.net/4f466ce5-94c0-46b7-8c7f-a7042b81cb81/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 448px; height: 81px;" /></p>

<p style="text-align: center;">Figure D.2: Time 1. Froggie hopped up, the cars all moved. Some cars left, and some new cars appeared.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16627.%E2%80%85Froggie/b2b3795e.png" data-original-src="https://upload.acmicpc.net/9abeac18-3e9d-4f64-9f4a-6391c0cdf7b9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 447px; height: 76px;" /></p>

<p style="text-align: center;">Figure D.3: Time 2. Froggie hopped up to the middle lane.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16627.%E2%80%85Froggie/01b08c5a.png" data-original-src="https://upload.acmicpc.net/bbfcd810-3360-4316-bde2-1a80127a11b3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 447px; height: 73px;" /></p>

<p style="text-align: center;">Figure D.4: Time 3. Froggie hopped up to the top lane.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16627.%E2%80%85Froggie/a0a243a8.png" data-original-src="https://upload.acmicpc.net/d0f612df-a330-44a1-9b19-a64aca0e10ed/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 439px; height: 94px;" /></p>

<p style="text-align: center;">Figure D.5: Time 4. Froggie hops to safety!</p>

<p><strong>Avoiding Cars</strong></p>

<p>If Froggie enters the path of a moving car she is squished. Consider Figure D.6, which is a bit different than earlier figures in that it shows one car over two successive times. Let&rsquo;s say that at time t the car is in the leftmost cell and Froggie is not in this lane. At time t + 1, the car moves with a speed of 3 to the rightmost cell, and Froggie attempts to hop into the lane shown. Since the width of the lane is four, the only safe place to hop is the leftmost cell (where the car had just been). The other three cells would cause her to be squished by the car shown, ending the simulation.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16627.%E2%80%85Froggie/f70f6032.png" data-original-src="https://upload.acmicpc.net/c5dab369-6533-4189-ba79-70ee9b589054/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 259px; height: 32px;" /></p>

<p style="text-align: center;">Figure D.6: A single car across two consecutive time steps, starting at the left and moving right.</p>

<p><strong>Goal</strong></p>

<p>Given a description of the road, car positions and speeds, and Froggie&rsquo;s starting positions and moves, determine her outcome after the simulation. There are two possible outcomes: safely exiting the top&nbsp;lane or getting squished.</p>

<p>In order to better plan her travel, Froggie may move left or right before entering the road. Once Froggie has entered the road she may only exit through the top of the road. That is, Froggie&rsquo;s path never exits the left, right, or bottom lane boundaries.</p>

### 입력

<p>Each input describes one simulation. The first line of input contains two integers separated by a space: L and W. The number of lanes is given by L (1 &le; L &le; 10), while W (3 &le; W &le; 20) defines the width (in number of cells) of the grid.</p>

<p>This is followed by L lines each describing the car configuration for a lane (from top to bottom). Each line contains three integers: O, the starting offset of the first car; I, the interval between cars; and S, the speed of the cars. The bounds are 0 &le; O &lt; I &le; W and 0 &le; S &le; W. All offsets should be computed based on the direction of lane movement.</p>

<p>The final line of input starts with a single integer, P (0 &le; P &le; W &minus; 1) followed by a space and then a string of M characters (1 &le; M &le; L &middot; W) from the set {U, D, L, R}. P defines the starting position of Froggie, starting from the left. The string of characters defines the sequence of moves (up, down, left, right) that Froggie makes during the simulation.</p>

### 출력

<p>If Froggie successfully crosses the road (exiting the road from the top lane), output &ldquo;safe&rdquo;. If Froggie is hit by a car, or does not end above the road, output &ldquo;squish&rdquo;.</p>