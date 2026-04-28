# [Silver IV] Laser Beam - 31108

[문제 링크](https://www.acmicpc.net/problem/31108)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 44, 맞힌 사람: 32, 정답 비율: 84.211%

### 분류

수학, 기하학, 사칙연산

### 문제 설명

<p>There are two infinite flat mirrors located at an angle $\alpha$ relative to each other so that they can be considered as rays on the plane when viewed from the side. Through a tiny hole in one of the mirrors, a laser beam is launched at an angle $\beta$ as shown in the figure below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31108.%E2%80%85Laser%E2%80%85Beam/fe1f353a.png" data-original-src="https://upload.acmicpc.net/567f4721-c70d-4626-862c-95eb3f248572/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 142px;" /></p>

<p>Your task is to count the number of reflections of the laser beam from the mirrors before it goes to infinity. The angle of incidence of the beam on the mirror always coincides with the angle of reflection. The hole through which the beam is launched is extremely small, so we can assume that if the beam suddenly hits the hole, it will still be completely reflected according to the usual rules.</p>

### 입력

<p>Given two integers $\alpha$ and $\beta$ --- angles given in degrees ($1 \le \alpha \le 179$, $1 \le \beta \le 179$).</p>

### 출력

<p>Print one integer --- the number of reflections.</p>

### 힌트

<p>In the first example, the beam is reflected as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31108.%E2%80%85Laser%E2%80%85Beam/4a5acafd.png" data-original-src="https://upload.acmicpc.net/791ee154-01fa-499d-963b-932338d4833b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 113px;" /></p>