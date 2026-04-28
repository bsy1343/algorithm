# [Gold IV] Fuel Stops - 4799

[문제 링크](https://www.acmicpc.net/problem/4799)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 25, 맞힌 사람: 21, 정답 비율: 84.000%

### 분류

누적 합, 두 포인터

### 문제 설명

<p>You are required to take a circular tour of a given set of cities: start at a certain city, visit each city once, and return to the city at which you started.</p>

<p>Each city is identified by a number: 1, 2, 3, etc. The numbering of the cities specifies the path you must take, but the starting point is not specified. From the highest numbered city, you proceed to City 1. For example, if there are three cities (numbered 1, 2, 3) you have three choices for completing the tour:</p>

<ul>
	<li>Start at 1, proceed to 2, then to 3, then return to 1.</li>
	<li>Start at 2, proceed to 3, then to 1, then return to 2.</li>
	<li>Start at 3, proceed to 1, then to 2, then return to 3.</li>
</ul>

<p>There is a refueling station in each city, with a given quantity of available fuel. The sum of all the fuel supplies at the refuelling stations is equal to the fuel required to make the entire tour. You start with an empty tank at one of the refuelling stations. You will be running out of fuel just as you pull into the starting station upon successful completion of the tour.</p>

<p>You must determine which city (or cities) will qualify as a starting point for the tour without running out of fuel before returning to the starting station. Assume the fuel tank is sufficiently large to handle all of the refuelling operations.</p>

### 입력

<p>The input will contain data for several test cases. For each test case, there will be three lines of data. The first line will specify the number of cities as a single integer. The second line will specify the quantity of fuel available at each of the refuelling stations, in the order of city numbers: 1, 2, 3, etc. The third line will specify the quantity of fuel needed to get from each station to the next one, in the order of city numbers: from the station at city 1 to the station at city 2, from the station at city 2 to the station at city 3, etc; the last number specifies the quantity of fuel required to get from the highest numbered city&#39;s station back to the station at city 1. All fuel quantities are positive integers given in imperial gallons. The sum of the fuel supplies will not exceed the range of signed 32-bit integers. There will be at least two cities and up to 100000 cities. End of input will be indicated by a line containing zero for the number of cities; this line will not be processed.</p>

### 출력

<p>For each test case, there will be one line of output. After the case number, the output will list the city numbers that work as starting cities for a successful tour, as described above. In case of several possible starting cities, they must be listed in increasing order separated by a single space. Follow the format of the sample output. The Hungarian mathematician L. Lov&aacute;sz proved that there is always at least one possible starting city.</p>