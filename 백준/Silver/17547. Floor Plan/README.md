# [Silver III] Floor Plan - 17547

[문제 링크](https://www.acmicpc.net/problem/17547)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 194, 정답: 89, 맞힌 사람: 82, 정답 비율: 48.810%

### 분류

수학, 정수론, 해 구성하기

### 문제 설명

<p>You are an architect and you have just been appointed to build a new swimming hall. The organisation behind these plans has acquired funding for a swimming pool and surrounding building as large as they want, but unfortunately they could not find anyone willing to pay for the floor surrounding the pool. They decided to pay for the floor tiles out of their own pocket. Because this has already cost them an arm and a leg, they want you to use all the floor tiles in your proposed plan.</p>

<p>Being an architect, you care for aesthetics. You see it as absolutely vital that both the swimming pool and the surrounding building are perfect squares. This raises an interesting problem: how can you make sure that the square shapes are guaranteed, while still using all the floor tiles the organisation bought?</p>

<p>Given the number of tiles n, find the length of the side of the building m and and the length of the side of the pool k such that n = m<sup>2</sup> &minus; k<sup>2</sup>, or print impossible if no suitable m and k exist.</p>

### 입력

<ul>
	<li>One line containing a single integer 1 &le; n &le; 10<sup>9</sup>.</li>
</ul>

### 출력

<p>Print two non-negative integers m, k such that n = m<sup>2</sup> &minus; k<sup>2</sup>, or print impossible if no such integers exist. If there are multiple valid solutions, you may output any one of them.</p>