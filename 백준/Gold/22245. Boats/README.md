# [Gold III] Boats - 22245

[문제 링크](https://www.acmicpc.net/problem/22245)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 11, 맞힌 사람: 11, 정답 비율: 26.190%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Magicians have to come to the great assembly of Aglargond School of Magic. They can come with boats, among other ways. Organizers have reserved a ring for every participant, so he can tie his boat to the ring assigned uniquely to him. Every magician has sent the length of his boat to the organizers. The boat has to be tied so that the ring is somewhere on the length of the boat including endpoints of the boat. End of the boats can touch each other, but boats cannot overlap (see the picture). Because of this restriction it is possible that all boats cannot be tied at the same time. Organizing committee of the Magician Assembly asked you to write the program that finds the maximal number of the boats which can be tied at the same time to the assigned rings.</p>

<table class="table table-bordered td-center">
	<thead>
		<tr>
			<th>Allowed</th>
			<th>Not allowed</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22245.%E2%80%85Boats/9761ba52.png" data-original-src="https://upload.acmicpc.net/84cb7e4d-3576-4962-aa3f-2c9933248434/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 214px; height: 54px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22245.%E2%80%85Boats/787de4f1.png" data-original-src="https://upload.acmicpc.net/19094148-6f8b-4758-a8f0-ec860241551b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 54px;" /></td>
		</tr>
	</tbody>
</table>

### 입력

<p>The first line of input contains number of magicians, N (1&nbsp; &le;&nbsp;N&nbsp; &le;&nbsp; 10000). In each of the following N lines there are exactly two space separated integers l<sub>i</sub> and p<sub>i</sub> (1&nbsp;&le;&nbsp;l<sub>i</sub>, p<sub>i</sub>&nbsp;&le;&nbsp;100000, 1&nbsp;&le;&nbsp;i&nbsp;&le;&nbsp;N) representing the length of the boat and the position of the assigned ring along the river bank starting from the school building. No two rings have the same position.</p>

### 출력

<p>The output has exactly one line containing one number &ndash; maximal number of boats.</p>