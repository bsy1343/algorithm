# [Silver III] War on Weather - 4282

[문제 링크](https://www.acmicpc.net/problem/4282)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 23, 맞힌 사람: 23, 정답 비율: 76.667%

### 분류

기하학, 3차원 기하학, 구현

### 문제 설명

<p>After an unprovoked hurricane attack on the south shore, Glorious Warrior has declared war on weather. The first salvo in this campaign will be a coordinated pre-emptive attack on as many tropical depressions as possible. GW reckons that the attack will neutralize the tropical depressions before they become storms, and dissuade others from forming. GW has at his disposal k space-to-earth killer satellites at various locations in space. m tropical depressions are known to exist at various locations on the earth&#39;s surface. Each satellite can attack any number of targets on the earth provided there is line of sight between the satellite and each target. How many different targets can be hit?</p>

### 입력

<p>The input consists of several test cases. Each case begins with a line containing integers 0 &lt; k, m &le; 100 as defined above. k lines follow, each giving x,y,z - the location in space of a satellite at the scheduled time of attack. m lines then follow, each giving x,y,z - the location of a target tropical depression. Assume the earth is a sphere centred at (0,0,0) with circumference 40,000 km. All targets will be on the surface of the earth (within 10<sup>-9</sup> km) and all satellites will be at least 50 km above the surface. A line containing 0 0 follows the last test case.</p>

### 출력

<p>For each test case, output a line giving the total number of targets that can be hit. <u>There will be no target</u> which falls within 10<sup>-8</sup> km of the boundary between being within line-of-sight and not.</p>