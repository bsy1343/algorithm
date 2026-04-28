# [Silver III] Ornaments - 24772

[문제 링크](https://www.acmicpc.net/problem/24772)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 34, 맞힌 사람: 31, 정답 비율: 70.455%

### 분류

기하학, 피타고라스 정리

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24772.%E2%80%85Ornaments/b98272b4.png" data-original-src="https://upload.acmicpc.net/cdfa3f2e-6950-4321-b965-c49526cf4fe2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 159px; height: 362px; float: right;" />A factory is making ornaments for the upcoming holidays. Ornaments consist of a 2D glass sphere (i.e., a circle) that is designed to hang off a hook or nail using a string that tightly wraps around the ornament, as shown in the figure to the right.</p>

<p>Your task is to write a program that calculates the length of the string, given the radius r of the circle, the distance h from the knot to the center of the circle, and some multiplier to account for the excess needed to tie the knot.</p>

### 입력

<p>The input will contain multiple test cases. Each test case contains on a single line three integer numbers r (1 &le; r &le; 1000), h (r &le; h &le; 10000), and s (0 &le; s &le; 100). s denotes the necessary excess string in %. The percentage is relative to what would be needed without accounting for the knot, so if s = 25, you should increment the necessary length by 1/4.</p>

<p>The input will be terminated by a line containing 3 zeros.</p>

### 출력

<p>For each test case, output the length of the needed string, rounded to two decimals.</p>