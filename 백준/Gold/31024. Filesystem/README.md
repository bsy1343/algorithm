# [Gold III] Filesystem - 31024

[문제 링크](https://www.acmicpc.net/problem/31024)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 5, 맞힌 사람: 5, 정답 비율: 29.412%

### 분류

많은 조건 분기, 자료 구조, 해시를 사용한 집합과 맵, 구현, 연결 리스트, 파싱, 재귀, 문자열, 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Given a series of file system commands and queries, output the contents of the file requested by each query (a query is a filename to be printed out). If the query is invalid (e.g. path does not exist), the text <code>invalid!</code> must be printed.</p>

<p>The following commands must be supported:</p>

<ul>
	<li>
	<dl>
		<dt><code>echo &quot;&lt;content&gt;&quot; &gt; &lt;path&gt;</code></dt>
		<dd>
		<p>Writes <code>&lt;content&gt;</code> to the file <code>&lt;path&gt;</code>. If <code>&lt;path&gt;</code> exists, it must be a file, and the contents will be replaced. If the path does not exist, its parent directory must exist, and the file will be created. <code>&lt;content&gt;</code> will only contain ASCII numbers, letters, <code>*</code>, <code>?</code>, <code>&lt;</code>, <code>&gt;</code>, and space.</p>
		</dd>
	</dl>
	</li>
	<li>
	<dl>
		<dt><code>cp &lt;source&gt; &lt;destination&gt;</code></dt>
		<dd>
		<p>Copies file <code>&lt;source&gt;</code> to file or directory <code>&lt;destination&gt;</code>. If <code>&lt;destination&gt;</code> already exists and is a directory, the file will be copied to the <code>&lt;destination&gt;</code> directory, with a filename which is the final path component of <code>&lt;source&gt;</code>. Otherwise, <code>&lt;destination&gt;</code> is the new filename, and its parent directory must already exist. The new file replaces any existing content.</p>
		</dd>
	</dl>
	</li>
	<li>
	<dl>
		<dt><code>mv &lt;source&gt; &lt;destination&gt;</code></dt>
		<dd>
		<p>Moves file or directory <code>&lt;source&gt;</code> to the file or directory <code>&lt;destination&gt;</code>. Similarly to <code>cp</code>, if <code>&lt;destination&gt;</code> already exists and is a directory, the source file/directory will be moved to a path within the <code>&lt;destination&gt;</code> directory whose name matches the final path component of <code>&lt;source&gt;</code>. Otherwise, <code>&lt;destination&gt;</code> is the new filename, and its parent directory must already exist. The new file replaces any existing content, and <code>&lt;source&gt;</code> is removed.</p>
		</dd>
	</dl>
	</li>
	<li>
	<dl>
		<dt><code>rm &lt;path&gt;</code></dt>
		<dd>
		<p>Deletes the file with the path <code>&lt;path&gt;</code>.</p>
		</dd>
	</dl>
	</li>
	<li>
	<dl>
		<dt><code>mkdir &lt;path&gt;</code></dt>
		<dd>
		<p>Creates a directory with the path <code>&lt;path&gt;</code>. The parent directory must already exist.</p>
		</dd>
	</dl>
	</li>
	<li>
	<dl>
		<dt><code>rmdir &lt;path&gt;</code></dt>
		<dd>
		<p>Removes an empty directory with the path <code>&lt;path&gt;</code>.</p>
		</dd>
	</dl>
	</li>
</ul>

<p>All filesystem paths will only contain numbers, letters, or <code>/</code> and will not exceed 31 characters or 7 path components. Paths components will be separated by a <code>/</code>. All commands in the input are valid and will not refer to non-existent/invalid paths unless behavior is specified above. All commands will be less than 1024 characters.</p>

### 입력

<p>The first line of input contains <code>T</code> (<code>0 &lt; T &lt; 100</code>), indicating the number of test cases.</p>

<p>The next line of input contains <code>C</code> (<code>0 &lt; C &lt; 100</code>), indicating the number of commands for the test case. The next <code>C</code> lines will contain commands to generate the filesystem. The folder that the filesystem starts in may be ignored. In other words, the current directory (<code>./</code>) may be assumed.</p>

<p>The next line of input contains <code>Q</code> (<code>0 &lt; Q &lt; 20</code>), indicating the number of filenames for the test case whose contents should be printed. The next <code>Q</code> lines will contain filenames (or a path &amp; filename, e.g. <code>myfolder/myfile</code>) to print out the contents of a given file.</p>

### 출력

<p>Output the contents of the file a query requests or &quot;invalid!&quot; if the file does not exist.</p>

<p>Print out a blank after each case.</p>