# [Platinum III] 정사각형 세기 (Hard) - 25211

[문제 링크](https://www.acmicpc.net/problem/25211)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 140, 정답: 25, 맞힌 사람: 23, 정답 비율: 41.818%

### 분류

수학

### 문제 설명

<p style="text-align: center;"><img src="%EB%B0%B1%EC%A4%80/Platinum/25211.%E2%80%85%EC%A0%95%EC%82%AC%EA%B0%81%ED%98%95%E2%80%85%EC%84%B8%EA%B8%B0%E2%80%85(Hard)/f98cb2ec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25211.%E2%80%85%EC%A0%95%EC%82%AC%EA%B0%81%ED%98%95%E2%80%85%EC%84%B8%EA%B8%B0%E2%80%85(Hard)/f98cb2ec.png" data-original-src="https://upload.acmicpc.net/910b3417-360e-4eb9-8167-cc01768272f3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>민겸이는 4개의 서로 다른 사분면 위에 각 변이 \(x\)축 또는&nbsp;\(y\)축에 평행하면서 네 꼭짓점이 모두 격자점 위에 있는 직사각형을 하나씩 그렸다. 각 직사각형에서 \(x\), \(y\) 좌표가 모두 정수인 점들을 하나씩 선택해 만들 수 있는 정사각형의 개수를 구하라. 이때, 정사각형의 각 변은 \(x\)축 또는&nbsp;\(y\)축에 평행해야 한다.</p>

### 입력

<p>입력의 첫번째 줄에는 테스트 케이스의 개수 \(T\)가 주어진다.</p>

<p>각 테스트 케이스마다&nbsp;4줄의 입력이&nbsp;주어진다.&nbsp;각 줄에는 4개의 정수&nbsp;\(x_1\),&nbsp;\(y_1\),&nbsp;\(x_2\),&nbsp;\(y_2\)가 공백으로 구분되어&nbsp;주어진다.&nbsp;\(i\)번째 줄에 주어진 (\(x_1\),&nbsp;\(y_1\))은&nbsp;제 \(i\)사분면에 그린 직사각형의 꼭짓점 중 원점에 가장 가까운 점의 좌표이고,&nbsp;(\(x_2\),&nbsp;\(y_2\))은&nbsp;제 \(i\)사분면에 그린 직사각형의 꼭짓점 중 원점에 가장 먼 점의 좌표이다.</p>

### 출력

<p>각 직사각형에서 \(x\), \(y\) 좌표가 모두 정수인 점들을 하나씩 선택해 만들 수 있는 정사각형의 개수를 각 테스트 케이스마다 한 줄에 하나씩 출력한다.</p>

### 제한

<ul>
	<li>1 &le; \(T\) &le; 10<sup>5</sup></li>
	<li>1 &le;&nbsp;\(|x_1|\),&nbsp;\(|y_1|\),&nbsp;\(|x_2|\),&nbsp;\(|y_2|\) &le; 10<sup>5</sup></li>
	<li>\(|x_1 - x_2|\) &ge; 1</li>
	<li>\(|y_1 - y_2|\) &ge; 1</li>
</ul>

### 힌트

<p>각 사분면은 아래 그림과&nbsp;같이 위치한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25211.%E2%80%85%EC%A0%95%EC%82%AC%EA%B0%81%ED%98%95%E2%80%85%EC%84%B8%EA%B8%B0%E2%80%85(Hard)/2f4903a7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25211.%E2%80%85%EC%A0%95%EC%82%AC%EA%B0%81%ED%98%95%E2%80%85%EC%84%B8%EA%B8%B0%E2%80%85(Hard)/2f4903a7.png" data-original-src="https://upload.acmicpc.net/88fa8a66-b705-4a5c-a66c-4d85cd176e11/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>