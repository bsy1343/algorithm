# [Gold III] Mini Tetris - 20083

[문제 링크](https://www.acmicpc.net/problem/20083)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 9, 정답 비율: 52.941%

### 분류

(분류 없음)

### 문제 설명

<p>As you may know, the popular computer game &ldquo;Tetris&rdquo; was invented by Russian programmer Alexey Pajitnov. In this problem you need to write program&nbsp;which plays a simplified version of this game.</p>

<p>The playing field is a rectangular vertical shaft, called the &ldquo;well&rdquo;. Random figures of unit square blocks appear on top of the wall, the player chooses the horizontal position and rotation of the figure, after that the figure falls down in the well. The objective of the game is to create horizontal lines filled without gaps. When such a line is created, it disappears, and any blocks above the deleted line fall.</p>

<p>In this version of the game, the well size units, and there are only three types of figures:</p>

<table class="table table-bordered table-center-20 td-center th-center td-middle">
	<thead>
		<tr>
			<th>Type</th>
			<th>Figure</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20083.%E2%80%85Mini%E2%80%85Tetris/477e2636.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20083.%E2%80%85Mini%E2%80%85Tetris/477e2636.png" data-original-src="https://upload.acmicpc.net/3fd490de-ec3b-4028-bc62-9ceb300bec05/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 108px; height: 42px;" /></td>
		</tr>
		<tr>
			<td>2</td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20083.%E2%80%85Mini%E2%80%85Tetris/2c76678b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20083.%E2%80%85Mini%E2%80%85Tetris/2c76678b.png" data-original-src="https://upload.acmicpc.net/c00c569d-32b0-4185-9d98-71051394b937/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 79px; height: 46px;" /></td>
		</tr>
		<tr>
			<td>3</td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20083.%E2%80%85Mini%E2%80%85Tetris/e8feaae0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20083.%E2%80%85Mini%E2%80%85Tetris/e8feaae0.png" data-original-src="https://upload.acmicpc.net/53111709-d795-4394-9c2a-328b9f6bf2ef/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 79px; height: 78px;" /></td>
		</tr>
	</tbody>
</table>

<p>You lose if at some point there are five non-empty lines of the well. You win if you hadn&#39;t lost after <em>n</em> figures have fallen.</p>

<p>You need to write program which plays the game described above and wins regardless of which figures will appear.</p>

### 입력



### 출력



### 제한

<p>In all subtasks <em>n</em> &le; 1000.</p>