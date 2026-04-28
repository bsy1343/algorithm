# [Platinum II] Bridge - 4381

[문제 링크](https://www.acmicpc.net/problem/4381)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 33, 맞힌 사람: 31, 정답 비율: 34.066%

### 분류

그리디 알고리즘, 정렬, 해 구성하기, 역추적

### 문제 설명

<p><i>n</i>&nbsp;people wish to cross a bridge at night. A group of at most two people may cross at any time, and each group must have a flashlight. Only one flashlight is available among the&nbsp;<i>n</i>&nbsp;people, so some sort of shuttle arrangement must be arranged in order to return the flashlight so that more people may cross.</p>

<p>Each person has a different crossing speed; the speed of a group is determined by the speed of the slower member. Your job is to determine a strategy that gets all&nbsp;<i>n</i>&nbsp;people across the bridge in the minimum time.</p>

### 입력

<p>The first line of input contains&nbsp;<i>n</i>, followed by&nbsp;<i>n</i>&nbsp;lines giving the crossing times for each of the people. There are not more than 1000 people and nobody takes more than 100 seconds to cross the bridge.</p>

### 출력

<p>The first line of output must contain the total number of seconds required for all&nbsp;<i>n</i>&nbsp;people to cross the bridge. The following lines give a strategy for achieving this time. Each line contains either one or two integers, indicating which person or people form the next group to cross. (Each person is indicated by the crossing time specified in the input. Although many people may have the same crossing time the ambiguity is of no consequence.) Note that the crossings alternate directions, as it is necessary to return the flashlight so that more may cross. If more than one strategy yields the minimal time, any one will do.</p>