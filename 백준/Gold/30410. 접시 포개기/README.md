# [Gold II] 접시 포개기 - 30410

[문제 링크](https://www.acmicpc.net/problem/30410)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 510, 정답: 171, 맞힌 사람: 124, 정답 비율: 31.877%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>춘배는 배가 너무 고파서 밥을 모두 먹어 치웠고 현재 춘배의 앞에는 $N$개의 접시가 있다. $i$번째 접시의 두께는 정수 $A_i$로 표현되는데, 이제 배부르기 때문에 재미있는 놀이를 해보려고 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30410.%E2%80%85%EC%A0%91%EC%8B%9C%E2%80%85%ED%8F%AC%EA%B0%9C%EA%B8%B0/cdd7c790.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30410.%E2%80%85%EC%A0%91%EC%8B%9C%E2%80%85%ED%8F%AC%EA%B0%9C%EA%B8%B0/cdd7c790.png" data-original-src="https://upload.acmicpc.net/979b602e-9058-4fb8-92fa-a4a6cd640f84/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>다음과 같이 접시를 포갤 수 있을 때, 마지막에 남는 가장 두꺼운 접시의 두께를 최대화하는 것이 목표이다.</p>

<ul>
	<li>두께가 같은 인접한 두 접시를 포개어 두께가 $2$배가 된 새로운 접시를 그 자리에 놓는다.</li>
</ul>

<p>진짜로 접시를 포개면 깨질 수 있기 때문에 춘배는 당신의 도움을 얻고자 한다. 마지막에 남는 가장 두꺼운 접시의 두께를 최대화해보자!</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다. $(1 \le N \le 2 \times 10^5)$</p>

<p>두 번째 줄에 $N$개의 정수 $A_1, A_2, \cdots, A_N$이 공백을 사이에 두고 주어진다. $(1 \le A_i \le 2)$</p>

### 출력

<p>남아있는 가장 두꺼운 접시의 두께의 최댓값을 출력한다.</p>