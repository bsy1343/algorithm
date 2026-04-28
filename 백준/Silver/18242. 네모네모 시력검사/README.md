# [Silver IV] 네모네모 시력검사 - 18242

[문제 링크](https://www.acmicpc.net/problem/18242)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1371, 정답: 835, 맞힌 사람: 733, 정답 비율: 62.489%

### 분류

구현, 애드 혹

### 문제 설명

<p>네모네모 안과에서는 아래와 같은 방법을&nbsp;이용하여 시력검사를 진행한다.</p>

<p>격자가 그려진&nbsp;흰색 바탕의 N &times; M&nbsp;직사각형의 내부에&nbsp;한 변의 길이가 3보다 큰 홀수이며&nbsp;행 또는 열에 평행인 <strong>단 하나</strong>의&nbsp;정사각형의 테두리를&nbsp;색칠한다.</p>

<p>이때 정사각형의 네 변 중 한 변의 가운데는 색칠하지 않으며 이 색칠하지&nbsp;않은 변이 정사각형의 어느 변인지를 맞추어 보라는 것으로 시력 검사를 진행한다.</p>

<p>예를 들어&nbsp;N = 7, M = 8 직사각형 내부에 조건에 맞는 다음과 같은 정사각형을 그릴 수 있다.</p>

<p>왼쪽 예제의 경우 색칠하지 않은&nbsp;변이 오른쪽, 오른쪽 예제의 경우&nbsp;아래쪽에 있는 것을 알 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18242.%E2%80%85%EB%84%A4%EB%AA%A8%EB%84%A4%EB%AA%A8%E2%80%85%EC%8B%9C%EB%A0%A5%EA%B2%80%EC%82%AC/df57051f.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/18242.%E2%80%85%EB%84%A4%EB%AA%A8%EB%84%A4%EB%AA%A8%E2%80%85%EC%8B%9C%EB%A0%A5%EA%B2%80%EC%82%AC/df57051f.png" data-original-src="https://upload.acmicpc.net/9f13d3ca-ed40-4f17-bca3-7e674c55796d/-/crop/666x652/1,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 196px; width: 200px;" />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18242.%E2%80%85%EB%84%A4%EB%AA%A8%EB%84%A4%EB%AA%A8%E2%80%85%EC%8B%9C%EB%A0%A5%EA%B2%80%EC%82%AC/93dd3f26.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/18242.%E2%80%85%EB%84%A4%EB%AA%A8%EB%84%A4%EB%AA%A8%E2%80%85%EC%8B%9C%EB%A0%A5%EA%B2%80%EC%82%AC/93dd3f26.png" data-original-src="https://upload.acmicpc.net/db3a661e-3a7b-4e3a-84d8-09a04099dff4/-/crop/670x652/1,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 195px; width: 200px;" /></p>

<p>조건에 맞는 입력만 주어질 때, 모든 시력 검사 데이터를 통과하는 프로그램을 작성해보자.</p>

### 입력

<p>첫 번째 줄에 직사각형의 높이 N과 너비 M이&nbsp;주어진다. (5&nbsp;&le; N, M&nbsp;&le; 100)</p>

<p>두 번째 줄부터 N개의 줄에&nbsp;길이가 M인 문자열이 주어진다. i+1번째 줄의 j번째 문자가 &lsquo; # &rsquo; 일 경우 색칠한 칸,&nbsp;&lsquo; .&nbsp;&rsquo; 일 경우 색칠하지 않은 칸을 나타낸다.</p>

<p>문제에서 제시한 조건에 맞는 입력만 주어진다.</p>

### 출력

<p>정사각형의 색칠하지 않은 한 변이 왼쪽, 오른쪽, 위쪽, 아래쪽일 때에 따라 각각 LEFT, RIGHT, UP, DOWN을 출력한다.</p>