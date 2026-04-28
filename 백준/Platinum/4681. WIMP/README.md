# [Platinum III] WIMP - 4681

[문제 링크](https://www.acmicpc.net/problem/4681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 6, 맞힌 사람: 6, 정답 비율: 40.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A window manager takes care of the details of creating, displaying, moving, and resizing a collection of windows in a graphical user interface. It also handles input events (like mouse clicks) related to these window management tasks. Your project is to write a WIndow Manager Program (WIMP).</p>

<p>The WIMP controls a screen of size 1024 &times; 1024 (measured in pixels), with the upper left-hand pixel at (0, 0). The x-coordinates range from 0 at the left edge of the screen to 1023 at the right edge, and the y-coordinates range from 0 at the top of the screen to 1023 at the bottom. All coordinates are integers. The user can create and manipulate rectangular windows by moving the mouse and clicking the mouse button. A window has 4 distinct areas:</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Area</th>
			<th>Location and Size</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Close box</td>
			<td>upper left hand corner of the window (25 &times; 25 pixels)</td>
		</tr>
		<tr>
			<td>Zoom box</td>
			<td>upper right hand corner of the window (25 &times; 25 pixels)</td>
		</tr>
		<tr>
			<td>Motion bar</td>
			<td>fills the top 25 pixels of the window, excluding zoom and close boxes</td>
		</tr>
		<tr>
			<td>Data area</td>
			<td>remainder of the window</td>
		</tr>
	</tbody>
</table>

<p>A window will always be at least 51 &times; 26 so that all four areas are nonempty. Each window is assigned a unique integer identifier, starting at 0 (the first window created has id 0, the second one created has id 1, and so on). Identifiers are not reused.</p>

<p>The WIMP accepts the following events:</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Event</th>
			<th>Meaning</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>DN x y</td>
			<td>user pressed mouse button at location (x, y)</td>
		</tr>
		<tr>
			<td>UP x y</td>
			<td>user released mouse button at location (x, y)</td>
		</tr>
		<tr>
			<td>AT x y</td>
			<td>user moved mouse to location (x, y)</td>
		</tr>
		<tr>
			<td>CR l t r b</td>
			<td>create new window with positions left, top, right, and bottom</td>
		</tr>
		<tr>
			<td>RE</td>
			<td>redraw all windows from back to front</td>
		</tr>
		<tr>
			<td>ZZ</td>
			<td>exit the WIMP</td>
		</tr>
	</tbody>
</table>

<p>The values x, y, l, t, r, and b are all nonnegative integers within the dimensions of the screen. The CR event always generates a properly formed window. Because windows can overlap, on a RE event they must be redrawn from back (least recently on top) to front (most recently on top). This ensures that they appear correctly overlapped to the user.</p>

<p>It is the job of the WIMP to keep track of all windows, even if some are overlapping. The rules it uses are:</p>

<ol>
	<li>A new window is always completely visible (&lsquo;on top&rsquo; of all other windows).</li>
	<li>A DN event anywhere on a visible part of a window selects that window and puts it on top, making the entire window visible. A DN event that is not in the visible part of any window does not affect the currently selected window.</li>
	<li>Closing and zooming both require a DN event followed by an UP event in the appropriate box. There may be one or more AT events in between. The DN and UP events must be in the same box, but they don&rsquo;t have to be in the exact same location.</li>
	<li>Closing a window removes it from the screen.</li>
	<li>Zooming is a toggle that either makes the window occupy the entire screen, or returns the window to its initial size.</li>
	<li>A DN event in the motion bar allows the window to be relocated. The motion stops with an UP event. The window moves the same distance and direction that the mouse moved between the DN and UP events.</li>
	<li>AT events while moving a window must output the window&rsquo;s current position. AT events at any other time do not generate any output.</li>
	<li>Windows occupying the full screen cannot be moved.</li>
	<li>Windows can partially move off the visible screen.</li>
	<li>AT events happen.</li>
</ol>

### 입력

<p>The input file contains one or more lines, each of which contains a single event. A ZZ event signals the end of the input. The events are all part of the same session.&nbsp;</p>

### 출력

<p>For each user action, output the corresponding message. On an RE event, the location of all windows must be output from back-to-front using the format shown.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Action</th>
			<th>Message</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Create window</td>
			<td>Created window n at l, t, r, b</td>
		</tr>
		<tr>
			<td>Select window</td>
			<td>Selected window n</td>
		</tr>
		<tr>
			<td>Close window</td>
			<td>Closed window n</td>
		</tr>
		<tr>
			<td>Move window</td>
			<td>Moved window n to l, t, r, b</td>
		</tr>
		<tr>
			<td>Zoom window</td>
			<td>Resized window n to l, t, r, b</td>
		</tr>
		<tr>
			<td>Redraw</td>
			<td>Window n at l, t, r, b</td>
		</tr>
	</tbody>
</table>