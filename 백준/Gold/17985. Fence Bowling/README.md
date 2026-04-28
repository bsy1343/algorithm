# [Gold II] Fence Bowling - 17985

[문제 링크](https://www.acmicpc.net/problem/17985)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 32, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

수학, 기하학, 사칙연산

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/97a23032-07d9-4ac2-b1c9-34de22a6f272/-/preview/" style="width: 154px; height: 381px; float: right;" />Olav is spending an evening on his own, practicing in the bowling hall. Annoyingly, the side-rails in his lane are stuck in the active position, so if the ball goes out of bounds, then it simply bounces back in. This seems unfair to Olav, so he decide that any throw that does not bounce exactly k times in the fences before it hits the pins will be disqualified.</p>

<p>For this purpose, Olav has studied in detail how the ball bounces. His finding is that a ball hitting the fence with angle &alpha; relative to the normal, will bounce back with degree</p>

<p style="text-align: center;">arctan(2 tan(&alpha;))</p>

<p>relative to the normal. See the example in the picture to the right.</p>

<p>With which angle &beta; relative to the normal against the rails should Olav throw the ball to hit a strike after first bouncing k times? Note that to hit a strike, Olav must hit <em>exactly</em> the middle of the bowling lane when the ball reaches the end of the lane. He always begins the throw from the middle of the lane as well.</p>

### 입력

<p>The first and only line of input contains three positive integers k, w and ℓ. Here, k (1 &le; k &le; 10) is the number of bounces required, w (1 &le; w &le; 100) is the width of the bowling lane, and ℓ (1 &le; ℓ &le; 100) is the length of the bowling lane.</p>

### 출력

<p>A single real number, the angle &beta; in degrees. Any answer within an absolute or relative error of 10<sup>&minus;6</sup> will be accepted as a correct answer.</p>