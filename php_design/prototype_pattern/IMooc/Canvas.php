<?php 
namespace IMooc;

class Canvas
{
	public $data;

	function init($width = 20, $height = 10)
	{
		$data = array();
		for($i = 0; $i < $height; $i++)
		{
			for($j = 0; $j < $width; $j++)
			{
				$data[$i][$j] = '*';
			}
		}
		$this->data = $data;
	}

	function draw()
	{
		foreach($this->data as $line)
		{
			foreach ($line as $char) 
			{
				echo $char;
			}
			echo "<br />";
		}
	}

	function rect($a1, $a2, $b1, $b2)
	{
		foreach ($this->data as $k1 => $line) {
			if ($k1 < $a1 or $k1 > $a2) continue;
			foreach($line as $k2 => $char)
			{
				if ($k2 < $b1 or $k2 > $b2) continue;
				$this->data[$k1][$k2] = '&nbsp;';
			}
		}
	}




}






 ?>