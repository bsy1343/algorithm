# [Gold II] Song - 11245

[문제 링크](https://www.acmicpc.net/problem/11245)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>เครื่องดนตรีกระต่ายถูกสร้างขึ้นด้วยความอัจฉริยะของคนสมัยก่อนประวัติศาสตร์เพื่อสร้างความ บรรเทิงให้กับกระต่าย โดยเครื่องดนตรีนี้จะมีตัวโน๊ตทั้งหมด 26 ตัว เขียนแทนด้วยตัวอักษรภาษาอังกฤษ ตัวพิมพ์ใหญ่ A ถึง Z เมื่อน าตัวอักษรเหล่านี้มาเรียงต่อกันก็จะได้เป็นบทเพลงกระต่าย โดยตัวอักษร 1 ตัว หมายถึงการเล่นโน๊ตนั้น 1 จังหวะ ความยาวของบทเพลงนับจากจ านวนตัวอักษร เช่น AASDFG เป็นเพลงที่มี ความยาว 6 โดยจังหวะที่ 1 เล่นตัวโน๊ต A, จังหวะที่ 2 เล่นตัวโน๊ต A, จังหวะที่ 3 เล่นตัวโน๊ต S, จังหวะที่ 4 เล่นตัวโน๊ต D, จังหวะที่ 5 เล่นตัวโน๊ต F และจังหวะที่ 6 เล่นตัวโน๊ต G เป็นต้น</p>

<p>เมื่อไม่นานมานี้นักจิตวิทยากระต่ายได้ค้นพบว่าตัวโน๊ตจังหวะที่ i+1 จะให้ค่าความสุขขึ้นอยู่กับรูปแบบ ตัวโน๊ตจังหวะที่ i และ i+1 ตาม &ldquo;ตารางค่าความสุขจากตัวโน๊ต&rdquo; ซึ่งกระต่ายแต่ละตัวจะมีตารางนี้ไม่เหมือนกัน ตัวโน๊ตจังหวะที่ 1 ไม่ให้ค่าความสุขใดๆ</p>

<p>ตัวอย่าง&quot;ตารางค่าความสุขจากตัวโน๊ต&quot;</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th colspan="2" rowspan="2" style="text-align:center">&nbsp;</th>
			<th colspan="26" style="text-align:center">โน๊ตจังหวะที่ i+1</th>
		</tr>
		<tr>
			<th style="text-align:center">A</th>
			<th style="text-align:center">B</th>
			<th style="text-align:center">C</th>
			<th style="text-align:center">D</th>
			<th style="text-align:center">E</th>
			<th style="text-align:center">F</th>
			<th style="text-align:center">G</th>
			<th style="text-align:center">H</th>
			<th style="text-align:center">I</th>
			<th style="text-align:center">J</th>
			<th style="text-align:center">K</th>
			<th style="text-align:center">L</th>
			<th style="text-align:center">M</th>
			<th style="text-align:center">N</th>
			<th style="text-align:center">O</th>
			<th style="text-align:center">P</th>
			<th style="text-align:center">Q</th>
			<th style="text-align:center">R</th>
			<th style="text-align:center">S</th>
			<th style="text-align:center">T</th>
			<th style="text-align:center">U</th>
			<th style="text-align:center">V</th>
			<th style="text-align:center">W</th>
			<th style="text-align:center">X</th>
			<th style="text-align:center">Y</th>
			<th style="text-align:center">Z</th>
		</tr>
		<tr>
			<th rowspan="26" style="text-align:center; vertical-align:middle">
			<div style="transform: rotate(-90deg);">โน๊ตจังหวะที่ i</div>
			</th>
			<th style="text-align:center">A</th>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
		</tr>
		<tr>
			<th style="text-align:center">B</th>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
		</tr>
		<tr>
			<th style="text-align:center">C</th>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
		</tr>
		<tr>
			<th style="text-align:center">D</th>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
		</tr>
		<tr>
			<th style="text-align:center">E</th>
			<td style="text-align:center">4</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
		</tr>
		<tr>
			<th style="text-align:center">F</th>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
		</tr>
		<tr>
			<th style="text-align:center">G</th>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
		</tr>
		<tr>
			<th style="text-align:center">H</th>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
		</tr>
		<tr>
			<th style="text-align:center">I</th>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">8</td>
		</tr>
		<tr>
			<th style="text-align:center">J</th>
			<td style="text-align:center">5</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
		</tr>
		<tr>
			<th style="text-align:center">K</th>
			<td style="text-align:center">7</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
		</tr>
		<tr>
			<th style="text-align:center">L</th>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
		</tr>
		<tr>
			<th style="text-align:center">M</th>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
		</tr>
		<tr>
			<th style="text-align:center">N</th>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">5</td>
		</tr>
		<tr>
			<th style="text-align:center">O</th>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
		</tr>
		<tr>
			<th style="text-align:center">P</th>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">8</td>
		</tr>
		<tr>
			<th style="text-align:center">Q</th>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">9</td>
		</tr>
		<tr>
			<th style="text-align:center">R</th>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
		</tr>
		<tr>
			<th style="text-align:center">S</th>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
		</tr>
		<tr>
			<th style="text-align:center">T</th>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
		</tr>
		<tr>
			<th style="text-align:center">U</th>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">0</td>
		</tr>
		<tr>
			<th style="text-align:center">V</th>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
		</tr>
		<tr>
			<th style="text-align:center">W</th>
			<td style="text-align:center">8</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
		</tr>
		<tr>
			<th style="text-align:center">X</th>
			<td style="text-align:center">8</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">2</td>
		</tr>
		<tr>
			<th style="text-align:center">Y</th>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">7</td>
		</tr>
		<tr>
			<th style="text-align:center">Z</th>
			<td style="text-align:center">9</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">2</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">1</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">3</td>
			<td style="text-align:center">0</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">2</td>
			<td>4</td>
		</tr>
	</tbody>
</table>

<p>จากตารางข้างต้นสามารถค านวนค่าความสุขที่ได้จากบทเพลง AASDFG ได้ดังนี้ จังหวะที่ 1 ให้ค่า ความสุข 0, จังหวะที่ 2 ให้ค่าความสุข 9, จังหวะที่ 3 ให้ค่าความสุข 6, จังหวะที่ 4 ให้ค่าความสุข 2, จังหวะที่ 5 ให้ค่าความสุข 0 และจังหวะที่ 6 ให้ค่าความสุข 9 ดังนั้นเพลง AASDFG ให้ค่าความสุข 0+9+6+2+0+9 = 26 หน่วย</p>

<p>เรามี&ldquo;ตารางค่าความสุขจากตัวโน๊ต&rdquo; อยู่แล้ว อยากให้คุณช่วยเขียนโปรแกรมหาค่าความสุขที่มาก ที่สุดที่ได้จากบทเพลงที่มีตัวโน๊ตตัวแรกและมีความยาวตามที่เราก าหนด</p>

### 입력

<p>บรรทัดแรกเป็นจ านวนกรณีทดสอบ T ชุด (1 &le; T &le; 10) กรณีทดสอบแต่ละชุดประกอบด้วยข้อมูลดังนี้</p>

<ol>
	<li>&ldquo;ตารางค่าความสุขจากตัวโน๊ต&rdquo; จ านวน 26 บรรทัด แต่ละบรรทัดมีค่าความสุข sij จ านวน 26 ค่า แต่ละค่าคั่นด้วยช่องว่าง ค่าเหล่านี้เรียงล าดับเช่นเดียวกับตัวอย่าง &ldquo;ตารางค่าความสุขจาก ตัวโน๊ต&rdquo; (0 &le; sij &le; 100)</li>
	<li>บรรทัดถัดมาเป็นจ านวนค าถาม N ค าถาม (1 &le; N &le; 10)</li>
	<li>ถัดมา N บรรทัด เป็นตัวอักษรภาษาอังกฤษพิมพ์ใหญ่ C แสดงตัวโน๊ตเริ่มต้นของเพลง และความ ยาวของเพลง L ที่ต้องการ (1 &le; L &le; 100 000)</li>
</ol>

### 출력

<p>ส าหรับแต่ละกรณีทดสอบให้แสดงจ านวนเต็ม N จ านวน แสดงค่าความสุขที่มากที่สุดของเพลงที่มี ความยาว L จังหวะที่ขึ้นต้นด้วยตัวอักษรที่ก าหนด</p>