# [Silver II] Fitting on the Bed - 25860

[문제 링크](https://www.acmicpc.net/problem/25860)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 22, 맞힌 사람: 18, 정답 비율: 31.034%

### 분류

수학, 기하학

### 문제 설명

<p>Arup&rsquo;s daughter, Anya, doesn&rsquo;t like sleeping in a bed in the usual way. In particular, she is willing to put her head anywhere, and furthermore, she&rsquo;s willing to lie in any direction. For the purposes of this problem, Anya, who is quite skinny, as she&rsquo;s only at the fifth percentile in weight, will be modeled as a line segment with her head being one of the end points of the segment. The bed will be modeled as a rectangle with the bottom left corner with coordinates (0, 0), the top left corner with coordinates (0, L), where L is the length of the bed, and the top right corner with coordinates (W, L), where W is the width of the bed. In the left diagram below, Anya&rsquo;s head is near the top left corner and she&rsquo;s sleeping completely sideways, off the bed - this corresponds to the first sample case. In the right diagram below, her head starts at a point a bit below where it starts in the first diagram, but she&rsquo;s sleeping at a diagonal, which allows her to fit on the bed!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25860.%E2%80%85Fitting%E2%80%85on%E2%80%85the%E2%80%85Bed/304073c0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25860.%E2%80%85Fitting%E2%80%85on%E2%80%85the%E2%80%85Bed/304073c0.png" data-original-src="https://upload.acmicpc.net/611919b1-984a-49bf-bc52-66c4964323f2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 441px; height: 245px;" /></p>

<p>Given the size of the bed, the location of Anya&rsquo;s head, her height, and the angle in which her body is in relation to her head (here we use 0 degrees to indicate that her body is going straight to the right of her head and 90 degrees to indicate that her body is going above her head), determine if Anya is fully fitting within the bed or not. (Note: a normal sleeping position would be having your head near (W/2, L) with your body in the direction of 270 degrees.)</p>

### 입력

<p>The first line of input contains three positive integers: L (L &le; 500), the length of the bed in centimeters, W (W &le; 500), the width of the bed in centimeters, and H (H &le; 200), Anya&rsquo;s height in centimeters. The second line of input contains three non-negative integers: x (x &le; W), the number of centimeters from the left side of the bed Anya&rsquo;s head is, y (y &le; L), the number of centimeters from the bottom of the bed Anya&rsquo;s head is, and a (a &le; 359), the angle in degrees Anya&rsquo;s body is facing in relation to her head.</p>

### 출력

<p>On a line by itself, output &ldquo;YES&rdquo; (no quotes) if Anya completely fits on the bed, or &ldquo;NO&rdquo;, otherwise. Note: for all cases where Anya doesn&rsquo;t fit on the bed, at least 1% of her body will be off the bed. She&rsquo;s considered on the bed if part or all of her touches edges of the bed but none of her body extends off the bed.</p>

### 힌트

<p>Sample Explanation: In the first sample case, Anya&rsquo;s head is near the top of the bed 40 centimeters from the left end of the bed, but her body is veering completely to the right. Since there is only 110 cm to the right and Anya is 115 cm tall, 5 cm of her is off the bed. In the second sample case, Anya&rsquo;s head is 40 cm below where her head was for the first sample case, but she&rsquo;s sleeping in a diagonal in the direction of where the hour hand of a clock would be at 4:30. In this configuration, she has enough room to fit on the bed, since she can go up to 110 cm to the right and 150 cm down.</p>