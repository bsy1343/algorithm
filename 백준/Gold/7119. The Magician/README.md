# [Gold IV] The Magician - 7119

[문제 링크](https://www.acmicpc.net/problem/7119)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 21, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>The circus magician T&acirc;lr&icirc;ts Vakars shows magic tricks. In his demonstrations he uses only:</p>

<p>baloons (<img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" />), doves (<img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" />), rabbits (<img alt="" src="https://upload.acmicpc.net/0f19dd19-5bf3-4230-a26c-297f5a9adad9/-/preview/" />) and poodels (<img alt="" src="https://upload.acmicpc.net/f2666d78-9fc0-46b1-9684-4de4a229054d/-/preview/" />).</p>

<p>T&acirc;lr&icirc;ts can carry out only the following tricks: (baloons and animals in the direction shown by the arrow are converted to different animals):</p>

<ol style="list-style-type:lower-alpha;">
	<li><img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" /><img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" /><img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" /><img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" />&nbsp;+&nbsp;<img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" /><img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" />&nbsp;+&nbsp;<img alt="" src="https://upload.acmicpc.net/0f19dd19-5bf3-4230-a26c-297f5a9adad9/-/preview/" />&nbsp;<img alt="" src="https://upload.acmicpc.net/90e103d0-f0a9-4a66-8de2-dc0cc07fe1d3/-/preview/" />&nbsp;<img alt="" src="https://upload.acmicpc.net/f2666d78-9fc0-46b1-9684-4de4a229054d/-/preview/" /><img alt="" src="https://upload.acmicpc.net/f2666d78-9fc0-46b1-9684-4de4a229054d/-/preview/" /></li>
	<li><img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" />&nbsp;+&nbsp;<img alt="" src="https://upload.acmicpc.net/f2666d78-9fc0-46b1-9684-4de4a229054d/-/preview/" />&nbsp;+&nbsp;<img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" /><img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" />&nbsp;<img alt="" src="https://upload.acmicpc.net/90e103d0-f0a9-4a66-8de2-dc0cc07fe1d3/-/preview/" />&nbsp;<img alt="" src="https://upload.acmicpc.net/0f19dd19-5bf3-4230-a26c-297f5a9adad9/-/preview/" /><img alt="" src="https://upload.acmicpc.net/0f19dd19-5bf3-4230-a26c-297f5a9adad9/-/preview/" /><img alt="" src="https://upload.acmicpc.net/0f19dd19-5bf3-4230-a26c-297f5a9adad9/-/preview/" /></li>
	<li><img alt="" src="https://upload.acmicpc.net/c24dabdf-39a8-4df3-b488-be434fa6fbb2/-/preview/" />&nbsp;+&nbsp;<img alt="" src="https://upload.acmicpc.net/0f19dd19-5bf3-4230-a26c-297f5a9adad9/-/preview/" />&nbsp;+&nbsp;<img alt="" src="https://upload.acmicpc.net/f2666d78-9fc0-46b1-9684-4de4a229054d/-/preview/" />&nbsp;<img alt="" src="https://upload.acmicpc.net/90e103d0-f0a9-4a66-8de2-dc0cc07fe1d3/-/preview/" /><img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" /><img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" /><img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" /><img alt="" src="https://upload.acmicpc.net/691c0ddb-290f-49f4-bbab-3ed892acb8a3/-/preview/" /></li>
</ol>

<p>Your task is to write a program that for the input number of baloons, doves, rabbits and poodels computes the maximum possible number of rabbits that T&acirc;lr&icirc;ts can obtain and the least number of tricks required to do this.</p>

### 입력

<p>The values of non-negative integer numbers b (number of baloons, b &le; 150), d (number of doves, d &le; 150), t (number of rabbits, t &le; 150) and p (number of poodels, p &le; 150) are input from the keyboard. It is also known that b + d + t + p &le; 250.</p>

### 출력

<p>The maximum possible number of rabbits that T&acirc;lr&icirc;ts can obtain must be displayed on the screen, as well as (separated by a space symbol) the minimal number of tricks that is required to obtain this number of rabbits.</p>