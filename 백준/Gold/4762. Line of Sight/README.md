# [Gold II] Line of Sight - 4762

[문제 링크](https://www.acmicpc.net/problem/4762)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 6, 맞힌 사람: 6, 정답 비율: 20.000%

### 분류

기하학, 스위핑

### 문제 설명

<p style="text-align: center;">An architect is very proud of his new home and wants to be sure it can be seen by people passing by his property line along the street. The property contains various trees, shrubs, hedges, and other obstructions that may block the view. For the purpose of this problem, model the house, property line, and obstructions as straight lines parallel to the x axis:<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4762.%E2%80%85Line%E2%80%85of%E2%80%85Sight/0ef3a07f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4762/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:491px" /></p>

<p>To satisfy the architect&rsquo;s need to know how visible the house is, you must write a program that accepts as input the locations of the house, property line, and surrounding obstructions and calculates the longest continuous portion of the property line from which the entire house can be seen, with no part blocked by any obstruction.</p>

### 입력

<p>Because each object is a line, it is represented in the input file with a left and right x coordinate followed by a single y coordinate:</p>

<p>&lt;x1&gt; &lt;x2&gt; &lt;y&gt;</p>

<p>Where x1, x2, and y are non-negative real numbers. x1 &lt; x2</p>

<p>An input file can describe the architecture and landscape of multiple houses. For each house,<br />
the first line will have the coordinates of the house. The second line will contain the coordinates of the property line. The third line will have a single integer that represents the number of obstructions, and the following lines will have the coordinates of the obstructions, one per line.</p>

<p>Following the final house, a line &ldquo;0 0 0&rdquo; will end the file.</p>

<p>For each house, the house will be above the property line (house y &gt; property line y). No obstruction will overlap with the house or property line, e.g. if obstacle y = house y, you are guaranteed the entire range obstacle[x1, x2] does not intersect with house[x1, x2].</p>

### 출력

<p>For each house, your program should print a line containing the length of the longest continuous segment of the property line from which the entire house can be to a precision of 2 decimal places. If there is no section of the property line where the entire house can be seen, print &ldquo;No View&rdquo;.</p>