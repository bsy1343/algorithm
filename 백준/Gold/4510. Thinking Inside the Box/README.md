# [Gold IV] Thinking Inside the Box - 4510

[문제 링크](https://www.acmicpc.net/problem/4510)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

기하학, 구현

### 문제 설명

<p>Data Co is having trouble organizing its vast collection of data. It has dozens of sets of survey data that span large portions of the globe. The bounding boxes of these surveys are stored so that anyone curious about a specific region&#39;s geological information merely needs to enter in some coordinates to retrieve the data; and that&#39;s where you come in...</p>

<p><img alt="Map image" src="%EB%B0%B1%EC%A4%80/Gold/4510.%E2%80%85Thinking%E2%80%85Inside%E2%80%85the%E2%80%85Box/8c949283.png" data-original-src="https://www.acmicpc.net/upload/images2/parkers-box.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The input file contains two lists, with each entry separated by a line break. The first is a list of bounding boxes stored in the system (These will be referred to as &ldquo;Data Boxes&rdquo;). The second is a list of bounding boxes that represent user queries (&ldquo;Query Boxes&rdquo;). Each list is preceded by the number of items in that list.</p>

<p>Bounding boxes are represented by two Latitude/Longitude coordinates. The first represents a top corner of the box, the second represents the opposite corner of the box. The two points are separated by a space.</p>

### 출력

<p>The program must determine which Data Boxes are touched in any way (sharing borders counts) by Query Boxes. The program should print out all Data Boxes touched by Query Boxes. If multiple Query Boxes touch the same Data Box, the coordinates of the Data Box must only be printed out once.</p>

<p>If no &quot;touching&quot; data and query boxes are found print &quot;<code>No data found.</code>&quot; without the quotes.</p>

### 힌트

<p>Latitude and Longitude are angular measurements. Lines of Latitude are the horizontal lines on the globe. The Equator has a Latitude of <code>0&deg;</code>, the North Pole has a Latitude of <code>90&deg;</code>, and the South Pole has a Latitude of <code>-90&deg;</code>. Lines of Longitude, called &lsquo;Meridians&rsquo; wrap vertically around the globe, always starting and ending at the poles. The Prime Meridian, which passes through Greenwich England, has a Longitude of <code>0&deg;</code>. Longitude values &lsquo;wrap around&rsquo; at the opposite Meridian at <code>&plusmn;180</code>. Longitude decreases as you go west of the Prime Meridian until it &lsquo;wraps around&rsquo; at <code>-180</code> (for example, New Orleans is at Longitude <code>-90</code>). Longitude increases as you go east of the Prime Meridian, again until it wraps around at <code>180</code> (Beijing is at Longitude <code>116</code>).</p>

<p>Both Query and Data Boxes can wrap &lsquo;around the middle&rsquo; of the globe, but may not wrap &lsquo;over the top&rsquo; of the globe.</p>