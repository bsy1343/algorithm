# [Silver I] Expanding Rods - 4311

[문제 링크](https://www.acmicpc.net/problem/4311)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 200, 정답: 41, 맞힌 사람: 35, 정답 비율: 22.436%

### 분류

수학, 기하학, 이분 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4311.%E2%80%85Expanding%E2%80%85Rods/286a8e9e.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4311.%E2%80%85Expanding%E2%80%85Rods/286a8e9e.jpg" data-original-src="https://www.acmicpc.net/upload/images3/rods.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:209px; width:270px" />When a thin rod of length L is heated n degrees, it expands to a new length L&#39;=(1+n*C)*L, where C is the coefficient of heat expansion.</p>

<p>When a thin rod is mounted on two solid walls and then heated, it expands and takes the shape of a circular segment, the original rod being the chord of the segment.</p>

<p>Your task is to compute the distance by which the center of the rod is displaced.</p>

### 입력

<p>The input contains multiple lines. Each line of input contains three non-negative numbers: the initial lenth of the rod in millimeters, the temperature change in degrees and the coefficient of heat expansion of the material. Input data guarantee that no rod expands by more than one half of its original length. The last line of input contains three negative numbers and it should not be processed.</p>

### 출력

<p>For each line of input, output one line with the displacement of the center of the rod in millimeters with 3 digits of precision.</p>