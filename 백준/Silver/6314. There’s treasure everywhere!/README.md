# [Silver I] There’s treasure everywhere! - 6314

[문제 링크](https://www.acmicpc.net/problem/6314)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 24, 맞힌 사람: 24, 정답 비율: 66.667%

### 분류

기하학, 구현, 파싱, 시뮬레이션, 문자열

### 문제 설명

<p>Finding buried treasures is simple: all you need is a map! The pirates in the Caribbean were famous for their enormous buried treasures and their elaborate maps. The maps usually read like &ldquo;Start at the lone palm tree. Take three steps towards the forest, then seventeen step towards the small spring, . . . blahblah ..., finally six steps toward the giant rock. Dig right here, and you will find my treasure!&rdquo; Most of these directions just boil down to taking the mentioned number of steps in one of the eight principal compass directions (depicted in the left of the figure).</p>

<p>Obviously, following the paths given by these maps may lead to an interesting tour of the local scenery, but if one is in a hurry, there is usually a much faster way: just march directly from your starting point to the place where the treasure is buried. Instead of taking three steps north, one step east, one step north, three steps east, two steps south and one step west (see figure), following the direct route (dashed line in figure) will result in a path of about 3.6 steps.</p>

<p>You are to write a program that computes the location of and distance to a buried treasure, given a &lsquo;traditional&rsquo; map.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6314.%E2%80%85There%E2%80%99s%E2%80%85treasure%E2%80%85everywhere!/ab07b907.png" data-original-src="https://www.acmicpc.net/upload/images2/treasure(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:219px; width:516px" /></p>

### 입력

<p>The input file contains several strings, each one on a line by itself, and each one consisting of at most 200 characters. The last string will be END, signaling the end of the input. All other strings describe one treasure map each, according to the following format:</p>

<p>The description is a comma-separated list of pairs of lengths (positive integers less than 1000) and directions (N (north), NE (northeast), E (east), SE (southeast), S (south), SW (southwest), W (west) or NW (northwest)). For example, 3W means 3 steps to the west, and 17NE means 17 steps to the northeast. A full stop (.) terminates the description, which contains no blanks.</p>

### 출력

<p>For every map description in the input, first print the number of the map, as shown in the sample output. Then print the absolute coordinates of the treasure, in the format &ldquo;The treasure is located at (x,y).&rdquo;. The coordinate system is oriented such that the x-axis points east, and the y-axis points north. The path always starts at the origin (0,0).</p>

<p>On the next line print the distance to that position from the point (0,0), in the format &ldquo;The distance to the treasure is d.&rdquo;. The fractional values x, y, d must be printed exact to three digits to the right of the decimal point, rounding to half even.</p>

<p>Print a blank line after each test case.</p>