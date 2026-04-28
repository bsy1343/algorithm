# [Platinum I] 구간 합 최대? 2 - 15561

[문제 링크](https://www.acmicpc.net/problem/15561)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1515, 정답: 582, 맞힌 사람: 464, 정답 비율: 37.299%

### 분류

자료 구조, 세그먼트 트리, 최대 부분 배열 문제

### 문제 설명

<p>길이&nbsp;<em>N</em>의 정수 수열&nbsp;<em>K</em><sub>1</sub>,&thinsp;<em>K</em><sub>2</sub>,&thinsp;...,&thinsp;<em>K</em><sub><em>N</em></sub>과 상수&nbsp;<em>U</em>,&nbsp;<em>V</em>가 주어진다.</p>

<p><em>Q</em>개의 쿼리가 주어지며, 그 종류는 두 가지가 있다.</p>

<ol>
	<li><em>A</em>,&nbsp;<em>B</em>가 주어지면,&nbsp;<em>max</em>(<em>U</em>&thinsp;&times;&thinsp;(<em>K</em><sub><em>i</em></sub>&thinsp;+&thinsp;<em>K</em><sub><em>i</em>&thinsp;+&thinsp;1</sub>&thinsp;+&thinsp;...&thinsp;+&thinsp;<em>K</em><sub><em>j</em></sub>)&thinsp;+&thinsp;<em>V</em>&thinsp;&times;&thinsp;(<em>j</em>&thinsp;-&thinsp;<em>i</em>))&nbsp;(<em>A</em>&thinsp;&le;&thinsp;<em>i</em>&thinsp;&le;&thinsp;<em>j</em>&thinsp;&le;&thinsp;<em>B</em>)&nbsp;의 값을 구한다.</li>
	<li><em>A</em>,&nbsp;<em>B</em>가 주어지면,&nbsp;<em>K</em><sub><em>A</em></sub>의 값을&nbsp;<em>B</em>으로 바꾼다.</li>
</ol>

### 입력

<p>첫 번째 줄에 정수&nbsp;<em>N</em>과&nbsp;<em>Q</em>,&nbsp;<em>U</em>,&nbsp;<em>V</em>가 입력된다.&nbsp;(1&thinsp;&le;&thinsp;<em>N</em>,&thinsp;<em>Q</em>&thinsp;&le;&thinsp;10<sup>5</sup>,&thinsp;&thinsp;-&thinsp;5&thinsp;&le;&thinsp;<em>U</em>,&thinsp;<em>V</em>&thinsp;&le;&thinsp;5)</p>

<p>두 번째 줄에 정수&nbsp;<em>K</em><sub>1</sub>,&thinsp;<em>K</em><sub>2</sub>,&thinsp;...,&thinsp;<em>K</em><sub><em>N</em></sub>이 주어진다.&nbsp;(-10<sup>2</sup>&thinsp;&le;&thinsp;<em>K</em><sub><em>i</em></sub>&thinsp;&le;&thinsp;10<sup>2</sup>)</p>

<p>세 번째 줄부터 쿼리가 주어진다. 세 정수&nbsp;<em>C</em>,&nbsp;<em>A</em>,&nbsp;<em>B</em>가 주어진다.&nbsp;(0&thinsp;&le;&thinsp;<em>C</em>&thinsp;&le;&thinsp;1, A, B, C는 정수)</p>

<p><em>C</em>가 0이면 첫 번째 쿼리를, 아니면 두 번째 쿼리를 수행한다. 첫 번째 쿼리일 경우&nbsp;1&thinsp;&le;&thinsp;<em>A</em>&thinsp;&le;&thinsp;<em>B</em>&thinsp;&le;&thinsp;<em>N</em>&nbsp;이다. 두 번째 쿼리일 경우&nbsp;1&thinsp;&le;&thinsp;<em>A</em>&thinsp;&le;&thinsp;<em>N</em>, -10<sup>2</sup>&thinsp;&le;&thinsp;<em>B</em>&thinsp;&le;&thinsp;10<sup>2</sup>이다.</p>

### 출력

<p>한 줄마다 첫 번째 쿼리의 결과값을 출력한다.</p>